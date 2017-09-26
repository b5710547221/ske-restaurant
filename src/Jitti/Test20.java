package Jitti;

import java.util.*;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner a = new Scanner(System.in);
		// System.out.print("How many adults?: ");
		// double ad = a.nextDouble();
		// System.out.print("How many children?: ");
		// double chi = a.nextDouble();
		// System.out.printf("%.0f adults cost = %.0f*500 =
		// %.2f\n",ad,ad,(ad*500));
		// System.out.printf("%.0f childrens cost = %.0f*250 =
		// %.2f\n",chi,chi,(chi*250));
		// System.out.printf("Total cost is %.2f\n",(ad*500+chi*250));
		//
		 Scanner a = new Scanner(System.in);
		 System.out.print("How many adults?: ");
		 double ad = a.nextDouble();
		 System.out.print("How many children?: ");
		 double chi = a.nextDouble();
		 System.out.print("Select a day (Su,Mo,Tu(25%),We(50%),Th,Fr,Sa): ");
		 String day = a.next();
		 if (day.equals("Tu")) {
		 System.out.printf("%.0f adults cost = %.0f*375.00 = %.2f\n", ad, ad, (ad
		 * 500 * 0.75));
		 System.out.printf("%.0f childrens cost = %.0f*187.50 = %.2f\n", chi,
		 chi, (chi * 250 * 0.75));
		 System.out.printf("Total cost is %.2f\n", ((ad * 500 + chi * 250) *
		 0.75));
		 } else if (day.equals("We")) {
		 System.out.printf("%.0f adults cost = %.0f*250 = %.2f\n", ad, ad*0.5, (ad
		 * 500 * 0.5));
		 System.out.printf("%.0f childrens cost = %.0f*125 = %.2f\n", chi,
		 chi, (chi * 250 * 0.5));
		 System.out.printf("Total cost is %.2f\n", ((ad * 500 + chi * 250) *
		 0.5));
		 } else {
		 System.out.printf("%.0f adults cost = %.0f*500 = %.2f\n", ad, ad, (ad
		 * 500));
		 System.out.printf("%.0f childrens cost = %.0f*250 = %.2f\n", chi,
		 chi, (chi * 250));
		 System.out.printf("Total cost is %.2f\n", (ad * 500 + chi * 250));
		 }
//
//		Scanner a = new Scanner(System.in);
//		System.out.print("How many adults?: ");
//		double ad = a.nextDouble();
//		System.out.print("How many children?: ");
//		double chi = a.nextDouble();
//		System.out.print("Select a day (Su,Mo,Tu(25%),We(50%),Th,Fr,Sa): ");
//		String day = a.next();
//		if (day.equals("Tu")) {
//			System.out.printf("%.0f adults cost = %.0f*500 = %.2f\n", ad, ad*0.75, (ad * 500 * 0.75));
//			System.out.printf("%.0f childrens cost = %.0f*250 = %.2f\n", chi, chi*0.75, (chi * 250 * 0.75));
//			if ((chi * 250 * 0.75) >= 1000) {
//				System.out.printf("Wednesday children spend over 1000B,discount 20\\% = %.2f - %.2f = %.2f",
//						(chi * 250 * 0.75), ((chi * 250 * 0.75) * 0.8),
//						((chi * 250 *0.75)-((chi * 250 *0.75) * 0.8)));
//				System.out.printf("Total cost is %.2f\n", ((ad * 500*0.75) + ((chi * 250 * 0.75) - (chi * 250 * 0.75) * 0.8)));
//			
//			}
//			System.out.printf("Total cost is %.2f\n", ((ad * 500 + chi * 250) * 0.75));
//		} else if (day.equals("We")) {
//			System.out.printf("%.0f adults cost = %.0f*500 = %.2f\n", ad, ad*0.5, (ad * 500 * 0.5));
//			System.out.printf("%.0f childrens cost = %.0f*250 = %.2f\n", chi, chi*0.5, (chi * 250 * 0.5));
//			if ((chi * 250 * 0.5) >= 1000) {
//				System.out.printf("Wednesday children spend over 1000B,discount 20\\% = %.2f - %.2f = %.2f",
//						(chi * 250 * 0.5), ((chi * 250 * 0.5) * 0.8),
//						((chi * 250 *0.5)-((chi * 250*0.5 ) * 0.2)));
//				System.out.printf("Total cost is %.2f\n", ((ad * 500*0.5) + ((chi * 250 * 0.5) - (chi * 250 * 0.5) * 0.8)));
//			}
//			
//			System.out.printf("Total cost is %.2f\n", ((ad * 500 + chi * 250) * 0.5));
//		} else {
//			System.out.printf("%.0f adults cost = %.0f*500 = %.2f\n", ad, ad, (ad * 500));
//			System.out.printf("%.0f childrens cost = %.0f*250 = %.2f\n", chi, chi, (chi * 250));
//			if ((chi * 250 * 0.75) >= 1000) {
//				System.out.printf("Wednesday children spend over 1000B,discount 20\\% = %.2f - %.2f = %.2f",
//						(chi * 250 ), ((chi * 250 ) * 0.2),
//						((chi * 250 )-((chi * 250 ) * 0.2)));
//				System.out.printf("Total cost is %.2f\n", ((ad * 500) + ((chi * 250 ) - (chi * 250) * 0.8)));
//			
//			}
//			System.out.printf("Total cost is %.2f\n", (ad * 500 + chi * 250));
//		}
	}

}
