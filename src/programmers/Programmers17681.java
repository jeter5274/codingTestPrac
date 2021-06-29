package programmers;

public class Programmers17681 {

	public static void main(String[] args) {
		int n = 5; //5 or 6
		int[] arr1 = {9, 20, 28, 18, 11}; //{9, 20, 28, 18, 11} or {46, 33, 33 ,22, 31, 50}
		int[] arr2 = {30, 1, 21, 17, 28}; //{30, 1, 21, 17, 28} or {27 ,56, 19, 14, 14, 10}
		String[] answer = new String[n];
		//{"#####","# # #", "### #", "# ##", "#####"} or {"######", "### #", "## ##", " #### ", " #####", "### # "}
		
		for (int i = 0; i < n; i++) {
			String mapLine = "";
			String binary1 = Integer.toBinaryString(arr1[i]);
			String binary2 = Integer.toBinaryString(arr2[i]);

			for (int j = binary1.length(); j < n; j++) {
				binary1 = "0" + binary1;
			}

			for (int j = binary2.length(); j < n; j++) {
				binary2 = "0" + binary2;
			}

			for (int j = 0; j < binary1.length(); j++) {
				if (binary1.charAt(j) == '0' && binary2.charAt(j) == '0') mapLine += " ";
				else mapLine += "#";
			}

			answer[i] = mapLine;
		}
		
		for(String line : answer) System.out.println(line);
		// return answer;
	}
}
