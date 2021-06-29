package programmers;

public class Programmers68935 {

	public static void main(String[] args) {

		int n = 45; // 45, 125
		int answer = 0;
		//7, 229 
		
		int length = 0, x = 1;

		while (x <= n) {
			x *= 3;
			length++;
		}

		int[] ternary = new int[length];

		while (n > 0 && length >= 1) {
			ternary[--length] = n % 3;
			n = n / 3;
		}

		for (int i = 0; i < ternary.length / 2; i++) {
			int temp = ternary[i];
			ternary[i] = ternary[ternary.length - 1 - i];
			ternary[ternary.length - 1 - i] = temp;
		}

		for (int i = 0; i < ternary.length; i++) {
			x /= 3;
			System.out.println(ternary[i] + ", " + x);
			answer += (ternary[i] * x);
		}

		System.out.println(answer);
		// return answer;
	}

}
