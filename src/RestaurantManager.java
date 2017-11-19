
//import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * 
 * this file run for manage inside tasks of restaurant
 * 
 * @author Warat Narattharaksa
 *
 */
public class RestaurantManager   {
	
	private static String menufile ="data/menu.txt";
	private static String[] menuItems ;
    private static double[] prices;
    
	public RestaurantManager() {
	}
    
	public static void setMenuItems(String[] menuItems) {
		RestaurantManager.menuItems = menuItems;
	}

	public static void setPrices(double[] prices) {
		RestaurantManager.prices = prices;
	}

	public static String[] getMenuItems() {
		
		return menuItems;
	}

	public static double[] getPrices() {
		
		return prices;
	}

	public static void setMenu(String filename) {
		double[] price = getPrices();
		String[] menuItem = getMenuItems();
		String option = "",menu="";
		double priceSub=0.0;
		int i = 0;
		
			ClassLoader loader = RestaurantManager.class.getClassLoader();

			// This is the key part: find and open the file as InputStream
			InputStream in = loader.getResourceAsStream( filename );
			if (in == null) {
			    System.out.println("Could not access file "+filename);
			    return;
			}

			Scanner reader = new Scanner( in );
			
			
			
			//Scanner reader = new Scanner(new FileReader(filename));
			
			String strLine;
			for(int i1 =0;(strLine=reader.nextLine().trim())!=null;i1++){

				
				if (strLine == null) {
					System.out.println("Could not access file " + filename);
					break;
				}

				if (strLine.startsWith("#") || strLine.isEmpty()) {
					continue;
				}
				String[] part = strLine.split(";");
				
				priceSub = Double.parseDouble(part[1]);
				
				prices[i1] = priceSub;
				strLine = strLine.substring(0, strLine.indexOf(";"));

				if (strLine.contains(",")) {
					String[] ops = strLine.split(",");

					option = ops[1];
					menu = ops[0];
					
					menuItems[i1] = menu;

				} else {

					option = "normal";
				}
				i1++;
				// System.out.println(strLine);

				
                 
			}
			reader.close();
			setMenuItems(menuItem);
			setPrices(price);
		
	}

	

	public static void recordOrder(int orderNumber, int[] order, double total) {
		double[] price = getPrices();
		String[] menuItem = getMenuItems();
		String outputfile = "data/testOutput.txt";
		OutputStream out = null;
		try {
			out = new FileOutputStream(outputfile);
		} catch (FileNotFoundException ex) {
			System.out.println("Couldn't open output file " + outputfile);
			return;
		}
	
		PrintStream pout = new PrintStream(out);

		
		
		pout.println("Order ID # "+ orderNumber);
		pout.printf("The time is %tT\n", System.currentTimeMillis());
		System.out.println("+----Menu------+--Qty----+---Price-----+");
		for (int i = 0; (i < order.length); i++) {
			if (order[i] >= 1) {
				pout.printf("|%d.) %-10s|%9d|%13.2f|\n", i + 1, menuItem[i], order[i], price[i]);
			}

		}
		pout.println("+--------------+---------+-------------|");
		pout.printf("|%-24s|%13.2f|\n", "Total(included VAT)",total);
		pout.println("+------------------------+-------------+");
		
		pout.close();
	}

	public static void init()  {
		// read the menu from file, put the data in arrays
		// open the sales log
		setMenu(menufile);

	}
	
	
}
