package programmers;

public class Programmers12977 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] 
									+ nums[k];
					int chk = 0;

					if (sum % 3 != 0) {
						for (int l = 1; l <= sum; l++) {
							if (sum % l == 0)
								chk++;
						}
					}

					if (chk == 2)
						answer++;
				}
			}
		}

		System.out.println("answer : " + answer);

	}
}
