import java.util.*;

public class JittatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		for (int j = 1; j <= 10; j++) {
			String word = a.next();
			int len = word.length()-1;
			int time = len / 2;
			int i = 0;
			for (; time >= 1; time--) {

				if (word.charAt(i) == word.charAt(len)) {
					len--;
					i++;
					if (time == 1) {
						System.out.print("yes");
						break;
					}
				} else {

					System.out.println("NO");
					break;
				}

			}
		}

	}

}
