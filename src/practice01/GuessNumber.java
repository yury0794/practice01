package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int num;
		String s;		

		while (true) {
			int number = random.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println("1-100");
			int i = 1;
			int l = 1;
			int n = 100;
			
			while (true) {
				System.out.print(i + ">>");
				num = scanner.nextInt();
				if (num > number) {
					n=num;
					System.out.println("더 낮게");
					System.out.println(l+"-"+n);
				}
				if (num < number) {
					l=num;
					System.out.println("더 높게");
					System.out.println(l+"-"+n);
				}
				if (num == number) {
					break;
				}
				i++;				
			}
			
			System.out.print("맞았습니다. 다시하시겠습니까?(y/n)>>");			
			s = scanner.next();
			if (s.equals("n")) {
				break;
			}
		}
	}
}