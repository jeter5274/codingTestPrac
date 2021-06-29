package programmers;

import java.util.Arrays;

public class Programmers42748 {

	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		//{5, 6, 3}
		
		for (int i = 0; i < commands.length; i++) {
			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = array[commands[i][0] - 1 + j];
			}

			Arrays.sort(temp);

			answer[i] = temp[commands[i][2] - 1];

		}

		//return answer;
		for(int num : answer) System.out.print(num + " ");

	}

}
