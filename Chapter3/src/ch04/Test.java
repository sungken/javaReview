package ch04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        


		System.out.println(solution("He11oWor1d", "lloWorl", 2));
		System.out.println(solution("Program29b8UYP", "merS123", 7));
		// replace 했을 경우 원하는 부분이 아니라 똑같은 부분만 전부 바뀔수 있다.
	
	
	}
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		String a = "";
		
		a = my_string.substring(s, overwrite_string.length() + s);
		answer = my_string.replace(a, overwrite_string);
		
		return answer;
//		return a;
	}
}


