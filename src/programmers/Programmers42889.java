package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers42889 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] answer = new int[N];

		int[] arrival = new int[N+1];
		int[] challenge = new int[N+1];
		double[] failRate = new double[N];

		for (int stage : stages) {
			challenge[stage - 1]++;
		}

		for (int i = 0; i < arrival.length; i++) {
			for (int j = i; j < arrival.length; j++) {
				arrival[i] += challenge[j];
			}
		}

		for (int i = 0; i < failRate.length; i++) {
			if (challenge[i] != 0) {
				failRate[i] = challenge[i] / arrival[i] * 1.0;
			}
		}

		List<Double> list = new ArrayList<Double>();

		for (Double rate : failRate)
			list.add(rate);

		Collections.sort(list, Collections.reverseOrder());

		int answerIdx = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < failRate.length; j++) {
				if (list.get(i) == failRate[j]) {
					failRate[j] = -1;
					answer[answerIdx++] = j;
					break;
				}
			}
		}
	}
}
