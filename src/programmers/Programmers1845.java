package programmers;

import java.util.HashMap;
import java.util.Map;

public class Programmers1845 {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3}; //{3,1,2,3} or {3,3,3,2,2,4} or {3,3,3,2,2,2}
		int answer = 0;
		//2, 3, 2
		
		Map<Integer, Integer> getPoketmon = new HashMap<Integer, Integer>();

		for (int num : nums)
			getPoketmon.put(num, getPoketmon.get(num) != null ? getPoketmon.get(num) + 1 : 1);

		if (getPoketmon.size() >= nums.length / 2)
			answer = nums.length / 2;
		else
			answer = getPoketmon.size();

		System.out.println(answer);
		// return answer;
	}
}
