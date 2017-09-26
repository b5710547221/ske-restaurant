package Jitti;
//elab-source: Test22.java
import java.util.*;
public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = a.nextInt();
        do{
        for(int i =1 ;i<=12;i++){
        	System.out.printf("%d x %d = %d\n",n,i,i*n );
        }
        System.out.print("Input N: ");
        n = a.nextInt();
        }while(n>0);
	}

}
