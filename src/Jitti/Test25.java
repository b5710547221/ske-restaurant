package Jitti;
import java.util.*;
public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Input number: ");
        int n =a.nextInt();
        int i =1;
        System.out.print("\n"+n+" = ");
        while(n>=1){
        	System.out.print("");
        	n /= 1*i;
        	i *=10;
        }
	}

}
