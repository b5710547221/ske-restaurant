package Jitti;
//elab-source: Test14;
import java.util.*;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Enter t-shirt size (small/medium/large): ");
		int si = a.nextInt();
		switch (si) {
		case 1: {
			System.out.print("small t-shirt costs 100 Baht.");
			break;
		}
		case 2: {
			System.out.print("medium t-shirt costs 200 Baht.");
			break;
		}
		case 3: {
			System.out.print("large t-shirt costs 300 Baht.");
			break;
		}
		}
	}

}
