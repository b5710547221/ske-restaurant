
//elab-source: UnitConvert.java
package Jitti;
import java.util.Scanner;

public class Test30 {

    public static double convertBitToByte(int bit){
        
 return bit/8.0;


    }
    public static double convertBitToKB(int bit){
        
 return (bit/8.0)/Math.pow(2, 10);

    }
    public static double convertBitToMB(int bit){
        
 return (bit/8.0)/Math.pow(2, 20);

    }
    public static double convertBitToGB(int bit){
        
 return (bit/8.0)/Math.pow(2, 30);

    }
    public static double convertBitToTB(int bit){
        
 return (bit/8.0)/Math.pow(2, 40);

    }
    public static void main(String[] args) {
        
         Scanner a = new Scanner(System.in);
        System.out.println("Welcome to conversion program");
        
        System.out.print("Input file size (bits): ");
        int bit = a.nextInt();
        System.out.println("Which unit of your choice?\n1. Byte\n2. Kilobyte(KB)\n3. Megabyte(MB)\n4. Gigabyte(GB)\n5. Terabyte(TB)");
        System.out.print("Input your choice: ");
        int choi =a.nextInt();
        if(choi == 1){
            System.out.printf("%d bits = %.10f Byte\n",bit,convertBitToByte(bit));
        }else if(choi == 2){
          System.out.printf("%d bits = %.10f KB\n",bit,convertBitToKB(bit));
        }else if(choi == 3){
            System.out.printf("%d bits = %.10f MB\n",bit,convertBitToMB(bit));
        }else if(choi == 4){
            System.out.printf("%d bits = %.10f GB\n",bit,convertBitToGB(bit));
        }else if(choi == 5){
            System.out.printf("%d bits = %.10f TB\n",bit,convertBitToTB(bit));
        }else{
           System.out.println("Invalid command!");
        }
        System.out.println("Thank you for using conversion program.");

    }

}