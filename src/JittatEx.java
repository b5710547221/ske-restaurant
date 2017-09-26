import java.util.*;

public class JittatEx{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int sum = 0,counter =0;
    for(int num = 1;num<=n;num++){
    	counter = 0;
        for(int i = num;i>=1;i--){
            if(num%i == 0){
               counter++;
               
            }
        }
        if(counter==2){
        	sum += num;
        }
    }
    System.out.println(sum);
	}
}