package Jitti;
//elab-source: Test10.java
import java.util.*;
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Enter hour1: ");
		String h1 = a.next();
		int h11 =Integer.parseInt(h1)%24;
		System.out.print("Enter minute1: ");
		String m1 = a.next();
		int m11 = Integer.parseInt(m1);
		System.out.print("Enter hour2: ");
		String h2 = a.next();
		int h12 = Integer.parseInt(h2)%24;
		System.out.print("Enter minute2: ");
		String m2 = a.next();
		int m12 = Integer.parseInt(m2);
		int h3,m3;
		
			h3 = ((Math.abs(h11-h12))%23)*60;
			m3 = (Math.abs(m11-m12))%60;
			if(h11>h12){
				h3 = ((Math.abs(h12-h11+24))%23)*60;
				
			}
			if(m11 >m12){
				m3 = -1*((Math.abs(m12-m11))%60);
			}
			if(h11>=h12 && m11 >= m12){
				h3 += 23*60 + m3;
			}
			
		System.out.print("("+h1+":"+m1+" to "+h2+":"+m2+") Time passes "+(h3+m3) +" minutes.");
	}

}