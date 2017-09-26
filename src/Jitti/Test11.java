package Jitti;
//elab-source: Test11.java
import java.util.*;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		System.out.print("Enter change: ");
		double a1 = a.nextDouble();
		int sum = 0;
		if ((int) a1 / 1000 >= 1) {
			System.out.println("1000 notes: " + (int) a1 / 1000);
		}
		sum += a1 / 1000;
		a1 %= 1000;
		if ((int) a1 / 500 >= 1) {
			System.out.println("500 notes: " + (int) a1 / 500);
		}
		sum += a1 / 500;
		a1 %= 500;
		if ((int) a1 / 100 >= 1) {
			System.out.println("100 notes: " + (int) a1 / 100);
		}
		sum += a1 / 100;
		a1 %= 100;
		if ((int) a1 / 50 >= 1) {
			System.out.println("50 notes: " + (int) a1 / 50);
		}
		sum += a1 / 50;
		a1 %= 50;
		if ((int) a1 / 20 >= 1) {
			System.out.println("20 notes: " + (int) a1 / 20);
		}
		sum += a1 / 20;
		a1 %= 20;
		if ((int) a1 / 10 >= 1) {
			System.out.println("10 coins: " + (int) a1 / 10);
		}
		sum += a1 / 10;
		a1 %= 10;
		if ((int) a1 / 5 >= 1) {
			System.out.println("5 coins: " + (int) a1 / 5);
		}
		sum += a1 / 5;
		a1 %= 5;
		if ((int) a1 / 2 >= 1) {
			System.out.println("2 coins: " + (int) a1 / 2);
		}
		sum += a1 / 2;
		a1 %= 2;
		if ((int) a1 / 1 >= 1) {
			System.out.println("1 coins: " + (int) a1 / 1);
		}
		sum += a1 / 1;
		a1 %= 1;
		if ((int) a1 / 0.5 >= 1) {
			System.out.println("0.5 coins: " + (int) (a1 / 0.50));
		}
		sum += a1 / 0.5;
		a1 %= 0.50;
		if ((int) a1 / 0.25 >= 1) {
			System.out.println("0.25 coins: " + (int) (a1 / 0.25));
		}
		sum += a1 / 0.25;
		a1 %= 0.25;

	}

}
