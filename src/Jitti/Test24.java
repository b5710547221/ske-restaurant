package Jitti;
//elab-source: Test24.java
import java.util.*;
public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Input X: ");
        int x = a.nextInt();
        System.out.print("Input Y: ");
        int y = a.nextInt();
        for(int i =1;i<=y;i++){
        	for(int j=1;j<=x;j++){
        		System.out.print("#");
        	}
        	System.out.println();
        }
	}

}
