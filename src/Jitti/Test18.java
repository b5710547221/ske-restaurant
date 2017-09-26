package Jitti;
import java.util.*;
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner a = new Scanner(System.in);
//      String p ="";
//      while(!p.equals("ABC")){
//    	  System.out.print("Enter pass");
//    	  p =a.next();
//      }
//	  System.out.print("pass");
//      System.out.print("Please input N: ");
//      int n = a.nextInt();
//      int i = 1;
//	  while(i<=n){
//		  System.out.println(i);
//		  i++;
//	  }
//      System.out.print("Please input X: ");
//      int x = a.nextInt();
//      System.out.print("Please input Y: ");
//      int y = a.nextInt();
//      int i;
//      if(x%2==0){
//       i = ++x;
//      }else{
//       i =x;
//      }
//      while(i>=x && i<=y){
//    	  System.out.println(i); 
//    	  i+=2;
//      }
      System.out.print("Please input N: ");
      double  n =a.nextDouble();
      double sum =0,count=0;
      double min = 0,max =0;
      while(n !=-1){
      if(n>max){
      	max =n;
     
      }
      if(max>n){
    	min=n;
      }
     
      count++;
      sum+=n;
      System.out.print("Please input N: ");
      n =a.nextDouble();
      }
      System.out.println("Amount of numbers is " + (int)count);
      try{
      System.out.printf("Average is %.2f\n" , sum/count);
      }catch(Exception e){
      	System.out.println("NaN");
      }
      System.out.printf("Minimum is %.2f\n", min);
      System.out.printf("Maximum is %.2f", max);
        
	}

}
