package Jitti;

//elab-source: Elab.java
import java.util.Scanner;

public class Test31 {

	static Scanner a = new Scanner(System.in);
	static String op = "";

	public static double calculate(double x, String operation, double y) {
		String op = operation;
		if (op.equals("+")) {
			return x + y;
		} else if (op.equals("-")) {
			return x - y;
		} else if (op.equals("*")) {
			return x * y;
		} else if (op.equals("/")) {
			return x / y;
		}
		return x;

	}

	public static void main(String[] args) {
		double x = 0, num = 0, ini = 0;
		Scanner a = new Scanner(System.in);
		String op = "";
		System.out.print("Input initial Value : ");
		ini = a.nextDouble();
		System.out.println();
		System.out.print("Input Operator : ");
		op = a.next();
		// System.out.print("Input Number : ");
		// num = a.nextDouble();
		// System.out.print("Input Operator : ");
		// op = a.next();
		// System.out.print("Input Number :");
		// double num = a.nextDouble();
		// System.out.printf("Present Value = %.4f\n",calculate(ini,op,num));

		while ((op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) || ini != 0) {

			if ((op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {

				System.out.print("Input Number : ");
				num = a.nextDouble();
				x = calculate(ini, op, num);
				ini = x;
				System.out.printf("Present Value = %.4f\n", x);
				System.out.println();

			} else {
                x = ini;
				break;
			}
			System.out.print("Input Operator : ");
			op = a.next();

		}
		System.out.println();
		System.out.println("Finish Calculation.");
		System.out.printf("End Value is %.4f", x);
	}
}