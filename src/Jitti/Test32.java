package Jitti;
//elab-source: Test32.java
import java.util.*;
public class Test32 {
    static Scanner a = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Enter n: ");
        long n =a.nextInt();
        System.out.print("Enter r: ");
        long r =a.nextInt();
        
        long x = flat(n)/(flat(r)*flat(n-r));
        
        System.out.printf("Combination of (%d,%d) is %d",n,r,x);
        
	}
    static long flat(long n){
    	if(n!=0){
    	for(long i =(n-1) ;i>=1;i--){
    		n*=i;
    	}
    	}else{
    		n=1;
    	}
    	return n;
    }
}
