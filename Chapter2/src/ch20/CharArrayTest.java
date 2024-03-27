package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

	//문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
	
		char[] alpahbets = new char[26];
		char ch ='A';
		
		for(int i=0; i<alpahbets.length; i++) {
			alpahbets[i] = ch++;
		}
		
		for(int i=0; i<alpahbets.length; i++) {
			System.out.println(alpahbets[i] + ", " + (int)alpahbets[i]);
		}
		
		
		
	}//main

}//CharArrayTest
