package programmers;

public class Programmers12921 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			int count = 0;

			for (int j = i; j > 0; j--) {
				count += i % j == 0 ? 1 : 0;
			}

			if (count == 2)
				answer++;
		}

		System.out.println("answer : " + answer);

		}
}
