package programmers;

public class Programmers12926 {

	public static void main(String[] args) {
		String s = "AB"; // "AB" or "z" or "a B z"
		int n = 0;	//1 or 1 or 4
		String answer = "";
		//"BC", "a", "e F d"
		
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);

			if (temp >= 'a' && temp <= 'z') {

				if (temp + n > 'z')
					answer += (char) (temp + n - ('z' - 'a' + 1));
				else
					answer += (char) (temp + n);

			} else if (temp >= 'A' && temp <= 'Z') {

				if (temp + n > 'Z')
					answer += (char) (temp + n - ('Z' - 'A' + 1));
				else
					answer += (char) (temp + n);

			} else
				answer += " ";

		}
		System.out.println(answer);
		// return answer;
	}
}
