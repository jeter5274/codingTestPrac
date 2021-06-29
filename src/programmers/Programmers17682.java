package programmers;

public class Programmers17682 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T"; // "1S2D*3T" or "1D2S#10S" or "1D2S0T" or "1S*2T*3S" or "1D#2S*3S" or "1T2D3D#" or "1D2S3T*"
		int answer = 0;
		//37, 9, 3, 23, 5, -4, 59
		
		int[] scores = new int[3]; // 3게임 점수를 저장하는 배열
		int sIdx = 0; // 점수배열의 index로 게임주기를 의미함
		int tempScore = 0; // 점수를 정수형으로 변환하여 저장할 변수
		String StringScore = ""; // 점수가 10일 경우를 대비한 문자열 점수 변수

		// dartResult을 문자를 순서대로 옮겨가며 분석함
		for (int i = 0; i < dartResult.length(); i++) {
			char getChar = dartResult.charAt(i);

			if (getChar >= '0' && getChar <= '9') {
				// 숫자일 경우 해당 숫자를 StringScore에 문자열로 저장
				// 10일 경우, StringScore는 "1"+"0"으로 10이 된다.

				StringScore += getChar;
			} else if (getChar == 'S' || getChar == 'D' || getChar == 'T') {
				// S, D, T인 경우 앞에 점수가 존재하다는 의미이며 모든 점수에 존재한다.

				// StringScore를 정수형으로 변환하여 tempScore에 저장 후 초기화
				tempScore = Integer.parseInt(StringScore);
				StringScore = "";

				// S, D, T에 따라 tempScore 제곱 연산
				switch (getChar) {
				case 'S':
					tempScore = (int) Math.pow(tempScore, 1);
					break;
				case 'D':
					tempScore = (int) Math.pow(tempScore, 2);
					break;
				case 'T':
					tempScore = (int) Math.pow(tempScore, 3);
					break;
				}

				// 연산된 tempScore를 점수배열에 저장하고 주기를 +1 한다.
				scores[sIdx++] = tempScore;

			} else if (getChar == '*') {
				// 옵션은 있을 수도 있고 없을 수도 있는 추가사항으로 이미 주기가 +1 된 시점이다.
				// 이에, sIdx의 -1, -2를 2배 올린다. 단, 첫번째 게임일 경우 이전 게임이 없기때문에 -2를 제외한다.
				if (sIdx > 1)
					scores[sIdx - 2] *= 2;
				scores[sIdx - 1] *= 2;
			} else if (getChar == '#') {
				// 옵션은 있을 수도 있고 없을 수도 있는 추가사항으로 이미 주기가 +1 된 시점이다.
				// 이에 현재시점인 sIdx-1에 -1을 곱해서 음수로 만들어 준다.
				scores[sIdx - 1] *= -1;
			}
		}

		// 스코어를 합산한다.
		for (int score : scores) {
			answer += score;
		}

		System.out.println(answer);
		// return answer;
	}
}
