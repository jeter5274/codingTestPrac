package programmers;

public class Programmers12901 {

	public static void main(String[] args) {
		int a = 5, b = 24;
		String answer = "";
		//TUE
		
		// 윤달 2월은 29일까지
		int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 2016년 몇일째인지 환산 후 7로 나눈 나머지에 따라 요일을 표시
		int days = b;

		for (int i = 0; i < a - 1; i++) {
			days += monthDays[i];
		}

		switch (days % 7) {
		case 0:
			answer = "THU";
			break;
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		}

		// return answer;

		System.out.println("answer : " + answer);

	}
}
