package ch14;

public class Subway {
	
	int lineNumber;
	int money;
	int passengerCount;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayinfo() {
		System.out.println(lineNumber + "번 지하철의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
	
	

}//Subway