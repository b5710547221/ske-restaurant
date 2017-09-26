package Jitti;
import java.util.*;
public class HW {
    static Scanner a = new Scanner(System.in);
    static int cho,qu=0,price = 0;
    static int pizzaPri =0;
    static int ChicPri =0;
    static int cokePri =0,Tprice=0,Tpizza=0,Tchic=0,Tcoke=0,Tqu=0;    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("--------Welcome to SKE Restaurant---------");
        System.out.println("1.) Pizza        250 Baht.");
        System.out.println("1.) Chickens     120 Baht.");
        System.out.println("1.) Coke         45 Baht.");
        System.out.println("1.) Total       ");
        System.out.println("1.) Exit        ");
        do{
        System.out.print("Enter your Choice: ");
         cho = a.nextInt();
         if(cho ==4){
        	 Tprice = pizzaPri + ChicPri + cokePri;
        	 print();
        	 
         }else if (cho==5){
        	 break;
         }
         if(cho != 4){
         System.out.print("Enter Quantity: ");
         qu = a.nextInt();
         
         if(cho == 1){
         	pizzaPri += 250*qu;
         	Tpizza += qu;
          }else if(cho == 2){
         	ChicPri  += 120*qu;
         	 Tchic += qu;
          }else if (cho==3){
         	 cokePri += 45*qu;
         	 Tcoke += qu;
          }
           Tqu += qu;
         }
        }while(cho != 5);
        System.out.println("======Thank you======");
	}
    static void print(){
    	
    	System.out.println("+----Menu-----+--Qty---+---Price----+");
    	if(Tpizza >=1){
    		System.out.printf("| Pizza       |      %d |       %d  |\n",Tpizza,pizzaPri);
    	}if(Tchic>=1){
    		System.out.printf("| Chicken     |      %d |       %d  |\n",Tchic,ChicPri);
    	}if (Tcoke>=1){
    		System.out.printf("| Coke        |      %d |       %d  |\n",Tcoke,cokePri);
    	}
    	System.out.println("+-------------+--------+------------|");
    	System.out.printf("| Total                |      %d   |\n",Tprice);
    	System.out.println("+----------------------+------------+");
    	
    }
}
