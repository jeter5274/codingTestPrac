package programmers;

public class Programmers72410 {

	public static void main(String[] args) {
		
		String new_id = "........................";//"aaaaaaaaaaaaaaaa";//"......a......a......a.....";//"-_.~!@#$%^&*()=+[{]}:?,<>/._-";//"=.=";//"123_.def";//"abcdefghijklmn.p";//"...!@BaT#*..y.abcdefghijklm";
		String answer = "";
		
		//1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase();
		System.out.println("1단계 : " +new_id);
		/*
		//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		char[] id_buffer = new_id.toCharArray();
		for(int i=0; i<id_buffer.length; i++) {
			if( !(
					(id_buffer[i] >= 'a' && id_buffer[i] <= 'z') 
					|| (id_buffer[i] >= '0' && id_buffer[i] <= '9') 
					|| id_buffer[i] == '-' 
					|| id_buffer[i] == '_'
					|| id_buffer[i] == '.' 
				)
			){
				id_buffer[i] = '!';
			}
			
			//3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			else if( id_buffer[i] == '.' && i != 0){
				int j = i-1;
				while(id_buffer[j--] != '!' && j>=0)
				
				if(id_buffer[i] == id_buffer[j]) id_buffer[j] = '!';
			}
		}
		
		for(char print : id_buffer) {
			System.out.print(print+" ");
		}
		System.out.println();
		new_id = new String(id_buffer);
		new_id = new_id.replace("!", "");
		
		System.out.println("2~3단계 : " +new_id); */
		
		// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		char[] id_buffer = new_id.toCharArray();
		for (int i = 0; i < id_buffer.length; i++) {
			if (!((id_buffer[i] >= 'a' && id_buffer[i] <= 'z') || (id_buffer[i] >= '0' && id_buffer[i] <= '9')
					|| id_buffer[i] == '-' || id_buffer[i] == '_' || id_buffer[i] == '.')) {
				id_buffer[i] = '!';
			}

			else if (id_buffer[i] == '.' && i != 0) {
				if (id_buffer[i] == id_buffer[i - 1])
					id_buffer[i - 1] = '!';
			}
		}

		for (char print : id_buffer) {
			System.out.print(print + " ");
		}
		System.out.println();
		new_id = new String(id_buffer);
		new_id = new_id.replace("!", "");

		System.out.println("2단계 : " + new_id);

		// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		id_buffer = new_id.toCharArray();
		for (int i = 0; i < id_buffer.length; i++) {
			if (id_buffer[i] == '.' && i != 0) {
				if (id_buffer[i] == id_buffer[i - 1])
					id_buffer[i - 1] = '!';
			}
		}

		for (char print : id_buffer) {
			System.out.print(print + " ");
		}
		System.out.println();
		new_id = new String(id_buffer);
		new_id = new_id.replace("!", "");

		System.out.println("3단계 : " + new_id);		 
		
		//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		new_id = ".b.";
		if(new_id.charAt(0) == '.'){
			if(new_id.length() > 1) new_id = new_id.substring(1, new_id.length());
			else new_id = ""; 
		}
		if(new_id.length() > 0 && new_id.charAt(new_id.length()-1) == '.'){
			new_id = new_id.substring(0, new_id.length()-1);
		}
		
		System.out.println("4단계 : " +new_id);
		
		//5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if(new_id.isEmpty()) new_id = "a";
		
		System.out.println("5단계 : " +new_id);
		
		//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		//만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if(new_id.length() >= 16) {
			if(new_id.charAt(14) == '.') new_id = new_id.substring(0, 14);
			else new_id = new_id.substring(0, 15);
		}
		
		System.out.println("6단계 : " +new_id);
		
		//7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if(new_id.length() <= 2) {
			for(int i=new_id.length(); i <3 ; i++) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}
		System.out.println("7단계 : " +new_id);
		
		answer = new_id;
		
		System.out.println(answer);
		
		String test = "hello world";
		test.toLowerCase().toCharArray();
	
		
	}

}
