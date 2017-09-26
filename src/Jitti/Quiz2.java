package Jitti;
import java.util.*;
public class Quiz2 {
    static Scanner a = new Scanner(System.in);
	public static int count=0,minprime =0,maxprime=0;
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = "A";
        do{
		System.out.print("Enter a number : ");
        int n = a.nextInt();
        System.out.println("Factors of "+n+" are: ");
        for(int i=1;i<=n;i++){
        	if(n%i==0){
        		System.out.print(i);
        		
        		
        		
        		System.out.println();
        	}
        }
        
        System.out.print("(A)gain or (Q)uit :  ");
        ans = a.next();
        }while(!ans.equals("Q"));
        System.out.println("Bye Bye");
	}
	

}
