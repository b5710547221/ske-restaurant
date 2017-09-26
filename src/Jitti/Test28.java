package Jitti;
//elab-source: test28.java
import java.util.*;
public class Test28 {
    private static Scanner a = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Choose (a), (b) or (q)uit: ");
        String i = a.next();
        while(!i.equals("q")&& !i.equals("Q")){
        answer(i);
        System.out.print("Choose (a), (b) or (q)uit: ");
        i = a.next();
        }
        System.out.println("Bye!");
	}
    public static void answer (String ans){
    	if(ans.equals("a")){
    		System.out.println("a is hit!");
    	}else if(ans.equals("b")){
    		System.out.println("b is hit!");
    	}else {
    		System.out.println("Incorrect Menu");
    	}
       
        	
        
    }
}
