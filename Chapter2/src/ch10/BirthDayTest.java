package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2024);
		date.setMonth(3);
		date.setDay(24);
		
		// 정보은닉을 통해서 원하는 정보를 보호할수 있다.(실수 방지)
		// ex) date.month = 100;
		date.showDate();
		
		
		
		
	}//main

}//BirthDayTest
