package Jitti;
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a = new Scanner(System.in);
        System.out.print("Enter R: ");
        double r = a.nextDouble();
        System.out.print("Enter G: ");
        double g = a.nextDouble();
        System.out.print("Enter B: ");
        double b = a.nextDouble();
        double w = Math.max(b/255, Math.max(r/255, g/255));
        double c = (w - (r/255))/w;
        double m = (w - (g/255))/w;
        double y = (w - (b/255))/w;
        double k = 1-w;
        System.out.printf("Conversion result: C = %.2f, M = %.2f, Y = %.2f, K = %.2f",c,m,y,k);
	}

}
