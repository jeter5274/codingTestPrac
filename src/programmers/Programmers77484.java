package programmers;

import java.util.HashMap;
import java.util.Map;

public class Programmers77484 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
		String answer = "";

		Map<String, Integer> completionList = new HashMap<String, Integer>();

		for (String name : participant) {
			completionList.put(name, completionList.get(name) != null ? completionList.get(name) + 1 : 1);
		}

		for (String name : completion) {
			completionList.put(name, completionList.get(name) - 1);
		}

		for (String name : participant) {
			if (completionList.get(name) > 0)
				answer = name;
		}
		
		System.out.println("answer : " +answer);

	}
}
