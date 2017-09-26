package Jitti;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner b = new Scanner(System.in);
		System.out.print("Enter a dividend A = ");
        int a = b.nextInt();
        System.out.print("Enter a divisor B = ");
        int b1 = b.nextInt();
        if(a%b1==0){
        	System.out.print(a + " IS divisible by "+b1);
        }else{
        	System.out.print(a + " IS NOT divisible by "+b1);
        }
	}

}
