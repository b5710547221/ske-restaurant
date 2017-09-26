package Jitti;
//elab-source: Test15;
import java.util.*;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = a.nextInt();
		if (num % 2 == 0) {
			System.out.printf("%d is an even number.\n", num);
		}  else {
			System.out.printf("%d is an odd number.\n", num);
		}
		if (num % 2 == 0 && num % 3 == 0) {
			
			System.out.printf("%d is also a multiple of 3.",num);
		}
	}

}
