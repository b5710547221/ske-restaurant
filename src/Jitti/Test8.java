package Jitti;
//elab-source: Test8.java
import java.util.*;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Input your status: ");
		String sta = a.nextLine();
		System.out.print("How many hour? ");
		int h = a.nextInt();
		switch (sta) {
		case "Student": {
           System.out.print("You have to pay "+ 20*h +" Baht.");
           break;
		}
		case "Staff": {
			 System.out.print("You have to pay "+ 10*h +" Baht.");
			 break;
		}
		case "Parent": {
			 System.out.print("You have to pay "+ 30*h +" Baht.");
			 break;
		}
		default: {
			 System.out.print("You have to pay "+ 50*h +" Baht.");
			 break;
		}
		}
	}

}
