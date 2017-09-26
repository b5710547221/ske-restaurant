package Jitti;
import java.util.*;
public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
        double am =a.nextDouble();
        int am2 = (int)am;
        double i=1,sum=0 ,max =0,min = 0;
        double ntemp;
        double[] count = new double[am2];
        Map m1 = new HashMap();
        int k =0,num;
        System.out.print("Please input N"+(int)i+": ");
        count[k] =a.nextDouble();
        i++;
        max =count[k];
        k++;
        while(am>1){
        	System.out.print("Please input N"+(int)i+": ");
        	//ntemp = a.nextDouble();
            //m1.put(ntemp,k);
        	count[k] =a.nextDouble();
        	if(count[k]>= max){
        		max  = count[k];

        		
        	}else{
        		min = count[k];
        		
        	}
        	sum+= count[k];
        	am--;
        	i++;
        	k++;
        }
        
        System.out.printf("Average is %.2f\n",sum+count[0]/am2+1);
        System.out.printf("Minimum is N%d = %.2f\n",(int)k+1,min);
        System.out.printf("Maximum is N%d = %.2f\n",(int)k-1,max);
	}

}
