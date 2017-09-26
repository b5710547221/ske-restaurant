package Jitti;
//elab-source: Test9.java
import java.util.*;
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Please input X: ");
        int x =a.nextInt();
        System.out.print("Please input Y: ");
        int y =a.nextInt();
        if(x>0 && y>0){
        	System.out.print("The point is in Q1.");
        }else if(x<0 && y>0){
        	System.out.print("The point is in Q2.");
        }else if(x<0 && y<0){
        	System.out.print("The point is in Q3.");
        }else if(x>0 && y<0){
        	System.out.print("The point is in Q4.");
        }else if(x==0 && y!=0){
        	System.out.print("The point is on the Y axis.");
        }else if(y==0 && x!=0){
        	System.out.print("The point is on the X axis.");
        }else if(x==0 && y==0){
        	System.out.print("The point is at the origin.");
        }
	}

}
