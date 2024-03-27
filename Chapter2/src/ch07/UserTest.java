package ch07;

public class UserTest {

	public static void main(String[] args) {
		
		UserInfo userJi = new UserInfo();
		
		userJi.userName = "지성근";
		userJi.phonNumber = "950206";
		userJi.userAddress = "경기도 화성시";
		userJi.userId = "1111";
		userJi.userPassword = "1234";
		
		System.out.println(userJi.showUserInfo());
		
		UserInfo userChoi = new UserInfo("2222", "1234", "최예림", "경기도 화성시", "010-9969-8094");
		System.out.println(userChoi.showUserInfo());
		

	}//main

}//UserTest
