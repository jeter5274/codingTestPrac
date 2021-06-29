package programmers;

import java.util.Stack;

public class Programmers64061 {

	public static void main(String[] args) {

		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		int answer = 0;

		Stack<Integer> outBox = new Stack<Integer>();

		for (int i = 0; i < moves.length; i++) {
			int column = moves[i] - 1;
			int dollNo = 0;
			System.out.println(i + ", " + column);
			
			for (int j = 0; j < board.length; j++) {
				if (board[j][column] > 0) {
					dollNo = board[j][column];
					board[j][column] = 0;
					break;
				}
				
			}
			
			if (!outBox.isEmpty() && (int)(outBox.peek()) == dollNo) {
				outBox.pop();
				answer += 2;
			}else if(dollNo > 0) outBox.push(dollNo);
		}
		
		System.out.println("answer : " +answer);
	}

}
