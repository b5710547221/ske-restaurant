package Jitti;
import java.util.*;
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = a.nextInt();
        int i = 1,s=0;
        while(i<=n){
            s+= i;
        	i++;
        }
        System.out.println("Sum = " + s);
	}

}
