package codingBat;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(diff21(30));
     
	}
	public static int diff21(int n) {
		  if(n<21){
		    return 21 - n;
		  }else{
		    return n - 21;
		  }
		}
	
}
