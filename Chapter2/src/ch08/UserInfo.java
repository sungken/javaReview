package ch08;

public class UserInfo {
	
	public int userHeight;
	public int userWeight;
	public String userName;
	public int userAge;
	
	public UserInfo(int userHeight, int userWeight, String userName, int userAge) {
		this.userHeight = userHeight;
		this.userWeight = userWeight;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	public void showUserInfo() {
		
		System.out.printf("%s씨의 나이는 %d, 키는 %d, 몸무게는 %dKg 입니다"
							, userName, userAge, userHeight, userWeight);
		
	}//showUserInfo
	
}// UserInfo
