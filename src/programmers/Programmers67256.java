package programmers;

public class Programmers67256 {

	public static void main(String[] args) {

		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}; //{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5} or {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2} or {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
		String hand = "right"; //right or left or right
		String answer = ""; 
		// "LRLLLRLLRRL" or "LRLLRRLLLRR" or "LLRLLRLLRL"

		int[] posLHand = { 3, 0 }, posRHand = { 3, 2 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				posLHand = updatePos(numbers[i]);
				answer += "L";
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				posRHand = updatePos(numbers[i]);
				answer += "R";
			} else {
				int[] numPos = updatePos(numbers[i]);
				int distanceLHand, distanceRHand;

				distanceLHand = calculateDistance(posLHand, numPos);
				distanceRHand = calculateDistance(posRHand, numPos);

				if (distanceLHand == distanceRHand) {
					if ("left".equals(hand)) {
						posLHand = updatePos(numbers[i]);
						answer += "L";
					} else {
						posRHand = updatePos(numbers[i]);
						answer += "R";
					}
				} else if (distanceLHand < distanceRHand) {
					posLHand = updatePos(numbers[i]);
					answer += "L";
				} else {
					posRHand = updatePos(numbers[i]);
					answer += "R";
				}

			}
		}

		System.out.println(answer);
		// return answer;
	}

	static int[] updatePos(int num) {

		int[] position = { 0, 0 };

		switch (num) {
		case 1:
			position = new int[] { 0, 0 };
			break;
		case 2:
			position = new int[] { 0, 1 };
			break;
		case 3:
			position = new int[] { 0, 2 };
			break;
		case 4:
			position = new int[] { 1, 0 };
			break;
		case 5:
			position = new int[] { 1, 1 };
			break;
		case 6:
			position = new int[] { 1, 2 };
			break;
		case 7:
			position = new int[] { 2, 0 };
			break;
		case 8:
			position = new int[] { 2, 1 };
			break;
		case 9:
			position = new int[] { 2, 2 };
			break;
		case 0:
			position = new int[] { 3, 1 };
			break;
		}

		return position;
	}

	static int calculateDistance(int[] handPos, int[] numPos) {

		int result = 0;

		for (int i = 0; i < handPos.length; i++) {
			result += handPos[i] > numPos[i] ? handPos[i] - numPos[i] : numPos[i] - handPos[i];
		}

		return result;

	}
}
