package Jitti;
//elab-source: Test33.java
import java.util.*;

public class Test33 {
	static Scanner a = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter size: ");
		int n = a.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.printf("%3d", flat(i - 1) / (flat(j - 1) * flat(i - j)));
				}

			}
			System.out.println();
		}

	}

	static long flat(long n) {
		if (n != 0) {
			for (long i = (n - 1); i >= 1; i--) {
				n *= i;
			}
		} else {
			n = 1;
		}
		return n;
	}

}
