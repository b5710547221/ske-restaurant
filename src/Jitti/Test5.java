package Jitti;
import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Input x1: ");
        double x1 = a.nextDouble();
        System.out.print("Input x2: ");
        double x2 = a.nextDouble();
        System.out.print("Input y1: ");
        double y1 = a.nextDouble();
        System.out.print("Input y2: ");
        double y2 = a.nextDouble();
        double x11 = (Math.PI/180) * x1;
        double x12 = (Math.PI/180) * x2;
        double y11 = (Math.PI/180) * y1;
        double y12 = (Math.PI/180) * y2;
        double dist =  6371 * Math.acos((Math.sin(x11)*Math.sin(x12)) + (Math.cos(x11)*Math.cos(x12)*Math.cos(y11-y12)));
	    System.out.printf("Great circle distance between (%.3f,%.3f) and (%.3f,%.3f) = %.3f kilometers.",x1,x2,y1,y2,dist);
	}

}
