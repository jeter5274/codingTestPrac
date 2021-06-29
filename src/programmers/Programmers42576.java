package programmers;

public class Programmers42576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lottos = {0,0,0,0,0,0};
		int[] win_nums = {1,2,3,4,5,6};

		int[] answer = new int[2];
		int zero_cnt = 0, win_cnt = 0;
		for (int lotto_num : lottos) {

			if (lotto_num == 0)
				zero_cnt++;
			else {
				for (int win_num : win_nums) {
					if (lotto_num == win_num)
						win_cnt++;
				}
			}

		}

		answer[0] = win_cnt + zero_cnt;
		answer[1] = win_cnt;

		for (int i = 0; i < answer.length; i++) {
			switch (answer[i]) {
			case 6:
				answer[i] = 1;
				break;
			case 5:
				answer[i] = 2;
				break;
			case 4:
				answer[i] = 3;
				break;
			case 3:
				answer[i] = 4;
				break;
			case 2:
				answer[i] = 5;
				break;
			default:
				answer[i] = 6;
				break;
			}
		}

		// return answer;
	}

}
