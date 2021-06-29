package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Programmers68664 {

	public static void main(String[] args) {

		int[] numbers = {2,1,3,4,1}; //{2,1,3,4,1} or {5,0,2,7}
		int[] answer;
		//{2,3,4,5,6,7}, {2,5,7,9,12}
		
		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		Stack<Integer> sumStack = new Stack<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				sumMap.put(sum, sumMap.get(sum) == null ? 0 : sumMap.get(sum) + 1);
				sumStack.push(sum);

				if (sumMap.size() != sumStack.size())
					sumStack.pop();
			}

		}

		answer = new int[sumStack.size()];

		int i = 0;
		while (!sumStack.isEmpty()) {
			answer[i++] = sumStack.pop();
		}

		Arrays.sort(answer);

		for(int num : answer) System.out.print(num + " ");
		// return answer;
	}

}
