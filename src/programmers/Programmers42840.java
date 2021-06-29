package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers42840 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5}; //{1,2,3,4,5} or {1,3,2,4,2}
		int[] answer = {};
		// {1}, {1,2,3}
		
		// 수포자 1,2,3의 답안 패턴
		int[] giveupMathMan1 = { 1, 2, 3, 4, 5 };
		int[] giveupMathMan2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] giveupMathMan3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		// 수포자들의 정답 갯수
		int[] sumAnswer = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (i == 0) {
				if (answers[i] == giveupMathMan1[i]) sumAnswer[0]++;
				if (answers[i] == giveupMathMan2[i]) sumAnswer[1]++;
				if (answers[i] == giveupMathMan3[i]) sumAnswer[2]++;
			} else {
				if (answers[i] == giveupMathMan1[i % giveupMathMan1.length]) sumAnswer[0]++;
				if (answers[i] == giveupMathMan2[i % giveupMathMan2.length]) sumAnswer[1]++;
				if (answers[i] == giveupMathMan3[i % giveupMathMan3.length]) sumAnswer[2]++;
			}
		}

		int maxScore = 0;
		for (int i = 0; i < sumAnswer.length; i++) {
			if (maxScore < sumAnswer[i]) maxScore = sumAnswer[i];
		}

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i < sumAnswer.length; i++) {
			if (maxScore == sumAnswer[i]) q.offer(i + 1);
		}

		answer = new int[q.size()];

		int i = 0;
		while (!q.isEmpty()) {
			answer[i++] = q.poll();
		}

		// return answer;
		for(int student : answer) System.out.print(student + " ");

	}
}
