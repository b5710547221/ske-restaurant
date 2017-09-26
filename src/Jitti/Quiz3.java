package Jitti;

import java.util.*;

public class Quiz3 {
	static Scanner a = new Scanner(System.in);
	static Random r = new Random();
    static int newRandom(){
       return  r.nextInt(999)+0;
    }
    static boolean isPlaying(){
        return readString("(P)lay or (Q)uit: ").equals("P");
    }
    static int readInt(String p){
    	System.out.println(p);
    	return a.nextInt();
    }
    static String readString(String p){
        System.out.println(p);
        return a.next();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do{
			int ran = newRandom();
			System.out.println("Random is "+ ran);
		}while(isPlaying());
//		int count = 1;
//		int num = r.nextInt(999) + 0;
//		System.out.println("Note: the Random number is " + num);
//		System.out.print("Guess a number(0-999):");
//		int n = a.nextInt();
//		String s = "P";
//		while (!s.equals("Q")) {
//			while (n != num) {
//
//				if (n > num) {
//					System.out.println("More than");
//				} else if (n < num) {
//					System.out.println("Less than");
//				} else {
//					System.out.println("Correct! Well done!");
//				}
//				count++;
//				System.out.print("Guess a number(0-999):");
//				n = a.nextInt();
//			}
//
//			System.out.println("Total tries = " + count);
//			System.out.println("---------------");
//			System.out.print("(P)lay again,(Q)uit: ");
//			s = a.next();
//			if (s.equals("P")) {
//				num = r.nextInt(999) + 0;
//				System.out.println("Note: the Random number is " + num);
//				System.out.print("Guess a number(0-999):");
//				n = a.nextInt();
//			}
//		}
//		System.out.println("Bye Bye!");
	}

}
