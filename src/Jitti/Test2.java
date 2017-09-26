package Jitti;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
	    System.out.print("Input change: ");
	    double a1 =a.nextDouble();
	    int sum=0;
	    System.out.println("1000-baht banknotes = "+ (int)a1/1000);
	    sum += a1/1000;
	    a1 %= 1000;
	    System.out.println("500-baht banknotes = " +(int)a1/500);
	    sum += a1/500;
	    a1 %= 500;
	    System.out.println("100-baht banknotes = "+ (int)a1/100);
	    sum += a1/100;
	    a1 %= 100;
	    System.out.println("50-baht banknotes = "+(int)a1/50);
	    sum += a1/50;
	    a1 %= 50;
	    System.out.println("20-baht banknotes = "+(int)a1/20);
	    sum += a1/20;
	    a1 %= 20;
	    System.out.println("10-baht coins = "+(int)a1/10);
	    sum += a1/10;
	    a1 %= 10;
	    System.out.println("5-baht coins = "+(int)a1/5);
	    sum += a1/5;
	    a1 %= 5;
	    System.out.println("1-baht coins = "+(int)a1/1);
	    sum += a1/1;
	    a1%=1;
	    System.out.println("50-satang coins = "+(int)(a1/0.50));
	    sum += a1/0.5;
	    a1 %= 0.50;
	    System.out.println("25-satang coins = "+(int)(a1/0.25));
	    sum += a1/0.25;
	    a1 %= 0.25;
	   
	    
	    System.out.println("Total number of bankotes and coins = "+ (int)sum);
	}

}
