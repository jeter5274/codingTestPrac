package programmers;

import java.util.Scanner;

public class Programmers12943 {

	public static void main(String[] args) {
		long num;
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요(8000000미만) : ");
		num = sc.nextLong();

		if(num >= 8000000) System.out.println("입력하신 숫자는 8000000이상의 숫자입니다.");
		else {
			
			while (num != 1) {

				if (answer >= 500) {
					answer = -1;
					break;
				}

				num = num % 2 == 0 ? num / 2 : num * 3 + 1;

				answer++;
			}

			System.out.println(answer);
		}
		sc.close();
		
	}
}
