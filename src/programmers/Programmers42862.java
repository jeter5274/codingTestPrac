package programmers;

public class Programmers42862 {

	public static void main(String[] args) {
		int n = 5; //5 or 5 or 3
		int[] lost = {2, 4}; //{2, 4} or {2, 4} or {3}
		int[] reserve = {1, 3, 5}; // {1, 3, 5} or {3} or {1}
		//5, 4, 2

		// 학생 수
		int answer = n;

		// 학생들이 유니폼 현황 배열
		int[] haveUniform = new int[n];

		for (int i = 0; i < reserve.length; i++) {
			// 여분의 체육복이 있는 학생(index = 학생번호-1) +1
			haveUniform[reserve[i] - 1]++;
		}

		for (int i = 0; i < lost.length; i++) {
			// 체육복을 도난당한 학생(index = 학생번호-1) -1
			haveUniform[lost[i] - 1]--;
			// 체육복을 도난 당한 학생이 여분을 가지고 있지 않았으면 학생 수를 조정
			if (haveUniform[lost[i] - 1] == -1)
				answer--;
		}

		for (int i = 0; i < haveUniform.length; i++) {
			// 체육복 없는 학생이 1번 학생이 아닌 경우 앞번호 학생이 체육복이 있으면 빌림
			if (i != 0 && (haveUniform[i] == -1 && haveUniform[i - 1] == 1)) {
				// 체육복 갯수 조정
				haveUniform[i]++;
				haveUniform[i - 1]--;
				// 체육복을 없는 학생 1명 해결 : +1
				answer++;
				// 체육복 없는 학생이 마지막번호 학생이 아닌 경우 앞번호 학생이 체육복이 없고 뒷번호 학생이 있으면 빌림
			} else if (i != haveUniform.length - 1 && (haveUniform[i] == -1 && haveUniform[i + 1] == 1)) {
				// 체육복 갯수 조정
				haveUniform[i]++;
				haveUniform[i + 1]--;
				// 체육복을 없는 학생 1명 해결 : +1
				answer++;
			}
		}

		// return answer;
		System.out.print(answer);

	}
}
