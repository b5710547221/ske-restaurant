package Jitti;

//elab-source: Test21.java
import java.util.*;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Input N: ");
		int n = a.nextInt();
		do {
			factor(n);
			System.out.print("Input N: ");
			n = a.nextInt();
		} while (n >= 0);
		System.out.print("Program ends.");
	}

	// 1000001
	public static void factor(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int j = 0, sum = 0, p = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				sum += i;
				arr.add(i);
				j++;
			}
		}
		if(n==0){
			arr.add(0);
		}
		System.out.print("Factors of " + n + " are ");
		for (int i = 0; i < arr.size(); i++) {

			System.out.print(arr.get(i) + " ");

		}

		if (arr.size() == 2) {
			p = 1;
		} else {
			p = 2;
		}

		System.out.println("\nSummation of factors is " + sum);
		if (p == 1) {
			System.out.println(n + " is prime number.");
		} else {
			System.out.println(n + " is not prime number.");
		}
	}
}
