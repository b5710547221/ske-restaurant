
import java.io.File;
import java.util.*;

/**
 * Main class for SKE Restaurarnt order taking application. It displays a menu
 * and accepts items to order. When done, it prints a receipt including the
 * order total.
 *
 * @author Warat Narattharaksa
 */
public class OrderTaker {
	static Scanner console = new Scanner(System.in);

	// private static final Object[][] menuItemsAndPrice = { { "Pizza", 250 }, {
	// "Chicken", 120 }, { "Coke", 45 } };

	private static final String[] menu = { "Papaya", "Chicken", "Coke", "Water" };

	private static final double[] price_list = { 25.00, 120.00, 45.00, 10.00 };

	private static double[] price = new double[menu.length];

	private static int orderNumber = 1;

	public static void main(String[] args) {

		// HW2
		// RestaurantManager res = new RestaurantManager();
		// res.init();
		// String[] menuFile = new String[res.getMenuItems().size()];
		// res.getMenuItems().toArray(menuFile);
		// double[] priceFile = new double[menuFile.length];
		// for(int i = 0 ;i< res.getPrices().size();i++){
		// priceFile[i] = res.getPrices().get(i);
		// }
		

		String exit = "n";
		do {
			int[] order = makeOrder(menu, price_list);

			
			 //order = makeOrder(menu, price_list);
			System.out.print("Are you want to finished order? ((y)es or (n)o ) --comfirm payment: ");
			exit = console.next();
		} while (!exit.equals("y"));
		console.close();
		System.out.println("Processing your order!!!");

		// HW3

	}

	/**
	 * print summary
	 */
	public static int[] printReceipt(int[] order, int orderNumber, double[] priceFile, String[] menuFile) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("Order ID # " + orderNumber);
		System.out.println("+----Menu------+--Qty----+---Price-----+");
		for (int i = 0; (i < order.length); i++) {
			if (order[i] >= 1) {
				System.out.printf("|%d.) %-10s|%9d|%13.2f|\n", i + 1, menuFile[i], order[i], priceFile[i]);
			}

		}
		System.out.println("+--------------+---------+-------------|");
		System.out.printf("|%-24s|%13.2f|\n", "Total(included VAT)", getTotal(order));
		System.out.println("+------------------------+-------------+");
		System.out.println("======Thank you======");

		return order;
	}

	/**
	 * add order
	 */
	public static int[] makeOrder(String[] menuFile, double[] price) {
		int[] order = new int[menuFile.length];
		int i = 0, j = 0, terminate = 0;
		String choice = "",new_choice="";
		do {
			printMenu(price);

			choice = getChoice();
			if (!isNumber(choice)) {
				if (choice.equals("A")) {
					break;
				} else if (choice.equals("B")) {
					System.out.println("======Thank you======");
					System.exit(0);
				}
			}

			int quantitySub = getQuantitySub();
			double[] priceFile = new double[menuFile.length];
			try {
				order = addToOrder(order, Integer.parseInt(choice), quantitySub);
			} catch (NumberFormatException ex) {
				System.out.println("Please enter valid commands");
			}
			priceFile = acceptPayment(order, price, priceFile);
			printReceipt(order, orderNumber, priceFile, menuFile);
			
			do {
				System.out.print("Do you want edit menu? enter old menu ID : (if not enter (-1): ");
				choice = getChoice();
				if( Integer.parseInt(choice) == -1){
					break;
				}
				System.out.print("Enter new menu ID :");
				new_choice = getChoice();
				quantitySub = getQuantitySub();
				try {
					int[] new_order = new int[menuFile.length];
					order = addToOrder(new_order, Integer.parseInt(new_choice), quantitySub);
				} catch (NumberFormatException ex) {
					System.out.println("Please enter valid commands");
				}
				priceFile = new double[menuFile.length];
				priceFile = acceptPayment(order, price, priceFile);
				printReceipt(order, orderNumber, priceFile, menuFile);
				System.out.print("Edit complete enter (-1) to continue payment  continue (any number): ");
				terminate = console.nextInt();
				
			} while (terminate != -1);
			if(terminate == -1){
				break;
			}
		} while ((!choice.equals("A")) && (!choice.equals("B")));
		
		orderNumber++;
		return order; // other parts of code can use order, too.
	}

	/**
	 * check if it is a number or not
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isNumber(String word) {
		try {
			Integer.parseInt(word);
			return true; // it worked!
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	/**
	 * check bill
	 */
	public static double[] acceptPayment(int[] order, double[] price_list_file, double[] priceFile) {

		for (int i = 0; i < order.length; i++) {

			priceFile[i] = price_list_file[i] * order[i];

		}

		return priceFile;

	}

	/**
	 * print Menu scripts
	 */
	public static void printMenu(double[] price_list_file) {
		System.out.println("--------Welcome to SKE Restaurant---------");
		for (int i = 0; i < menu.length && i < price_list_file.length; i++) {

			System.out.printf((i + 1) + ".) %-13s%-8.2fBaht.\n", menu[i], price_list_file[i]);

		}
		System.out.printf("A.) %-13s\n", "Check bill -- View");
		System.out.printf("B.) %-13s\n", "Terminate all order");
	}

	/**
	 * accept food choice
	 */
	public static String getChoice() {
		System.out.print("Enter your Choice: ");

		return console.next();
	}

	/**
	 * accept quantity
	 */
	public static int getQuantitySub() {
		System.out.print("Enter Quantity: ");

		return console.nextInt();
	}

	/**
	 * collect quantity
	 */
	public static int[] addToOrder(int[] order, int choice, int quantitySub) {
		for (int i = 0; i < order.length; i++) {
			if (choice == (i + 1)) {

				order[i] = quantitySub;

			}
		}
		return order;
	}

	/**
	 * collect sum up
	 */
	public static double getTotal(int[] order) {
		double total = 0.0;
		for (int k = 0; k < order.length; k++) {
			total += order[k] * price_list[k];
			// total += order[k] *price[k];
		}
		// do other stuff, like add VAT or apply a discount
		total *= 1.07;
		return total;
	}
}
