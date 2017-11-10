
//import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
/**
 * 
 * @author Warat Narattharaksa
 *
 */
public class RestaurantManager   {
	private static ArrayList<Object> record = new ArrayList<Object>();
	private static String menufile = "data/menu.txt";
	private static ArrayList<String> menuItem = new ArrayList<String>();
	private static ArrayList<Double> price = new ArrayList<Double>();
	private static Scanner console = new Scanner(System.in);

	public RestaurantManager() {
           
	}

	public ArrayList<String> getMenuItems() {
		return menuItem;
	}

	public ArrayList<Double> getPrices() {
		return price;
	}

	public static void setMenu(String filename) {
		String option = "",menu="";
		double priceSub=0.0;
		int i = 0;
		try {
			//FileInputStream fstream = new FileInputStream(filename);
			//BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
			
			//File file=new File(menufile);
			
			//File file = (File) Files.lines(data/menu.txt");
			Scanner reader = new Scanner(new FileReader("data/menu.txt"));
			
			do {

				String strLine = reader.nextLine().trim();
				if (strLine == null) {
					System.out.println("Could not access file " + filename);
					break;
				}

				if (strLine.startsWith("#") || strLine.isEmpty()) {
					continue;
				}
				String[] part = strLine.split(";");
				
				priceSub = Double.parseDouble(part[1]);
				price.add(priceSub);
				strLine = strLine.substring(0, strLine.indexOf(";"));

				if (strLine.contains(",")) {
					String[] ops = strLine.split(",");

					option = ops[1];
					menu = ops[0];
					menuItem.add(menu);

				} else {

					option = "normal";
				}
				i++;
				// System.out.println(strLine);

				
                 
			} while (true);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public static void recordOrder(int orderNumber, int[] order, double total) {

		String outputfile = "testOutput.txt";
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
				pout.printf("|%d.) %-10s|%9d|%13.2f|\n", i + 1, menuItem.get(i), order[i], price.get(i));
			}

		}
		pout.println("+--------------+---------+-------------|");
		pout.printf("|%-24s|%13.2f|\n", "Total(included VAT)",total);
		pout.println("+------------------------+-------------+");
		
		pout.close();
	}

	public void init()  {
		// read the menu from file, put the data in arrays
		// open the sales log
		setMenu(menufile);

	}
	
	
}
