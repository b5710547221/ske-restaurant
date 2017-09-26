package Jitti;

import java.util.*;

public class Test125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("Day: ");
		int day = a.nextInt();
		System.out.print("Month: ");
		int mon = a.nextInt();
		System.out.print("Year: ");
		int yrs = a.nextInt();
		System.out.printf("The date is %d/%d/%d\n", day, mon, yrs);
		if ((yrs % 4 == 0 && yrs % 100 != 0) || yrs % 400 == 0) {
			System.out.printf("%d is leap year.\n", yrs);
		} else {
			System.out.printf("%d is normal year.\n", yrs);
		}
		int left = 0;
		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			left = 31;
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			left = 30;
            break;
		}
		case 2:{
			if((yrs % 4 == 0 && yrs % 100 != 0) || yrs % 400 == 0){
				left = 29;
			}else{
				left = 28;
			}
			break;
		}
		}
		System.out.printf("%d days left until next month.",left-day);
	}

}
