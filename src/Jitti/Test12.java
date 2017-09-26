package Jitti;
//elab-source: Test12.java
import java.util.*;
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Please input x: ");
        double x = a.nextInt();
        if(x<=15){
        	System.out.printf("f(x): %.3f",2*x+10);
        }else if(x>15 && x <= 35){
        	System.out.printf("f(x): %.3f",3*Math.pow(x, 2));
        }else if(x >35){
        	System.out.printf("f(x): %.3f",2*Math.pow(x, 3)-5);
        	
        }
	}

}
