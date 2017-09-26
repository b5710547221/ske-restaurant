package Jitti;
//elab-source: Test123.java
import java.util.*;
public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = a.nextInt();
		double a1=0;
		for(int i =1 ;i<=n;i++){
			a1 += Math.pow(n, i);
		}
		System.out.printf("The formula value is %.4f",Math.sqrt(a1));
	}

}
