package Jitti;
//elab-source: Test7.java
import java.util.*;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Input weight: ");
        double a1 = a.nextDouble();
        System.out.print("Input height: ");
        double a2 =a.nextDouble();
        double bmi = a1/Math.pow(a2, 2);
        if(bmi<18.5){
        	System.out.printf("Your BMI is %.2f => Underweight",bmi);
        }else if(bmi >= 18.5 && bmi <= 23.4){
        	System.out.printf("Your BMI is %.2f => Normalweight",bmi);
        }else{
        	System.out.printf("Your BMI is %.2f => Overweight",bmi);
        }
	}

}
