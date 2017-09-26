package Jitti;
//elab-source: Elab.java
import java.util.Scanner;
public class Elab {
    
public static int price (String c ,String f){
   int price = 0;
   if(c.equals("Yoga")){
       if(f.equals("y")){
          price  = 2800;
       }else if(f.equals("n")){
          price = 3000;
       }
   }else if(c.equals("Aerobic")){
       if(f.equals("y")){
          price  = 3800;
       }else if(f.equals("n")){
          price = 4000;
       }
   }
   return price;
}


    public static void main (String[] args)
    {
        String course, first;
        
        Scanner a =new Scanner(System.in);
        
        System.out.print("Enter exercise class: ");
        course = a.next();
        while(!course.equals("Done")){
        System.out.print("Is it your first time taking the class (y/n)? ");
        first = a.next();

        
        int payment = price(course, first);

        System.out.printf("Your payment is %d Baht.\n", payment);  
        System.out.print("Enter exercise class: ");
        course = a.next();

        }
        System.out.print("Done!");

    }
}