package ch19;

public class Car {
	
	private int carNum;
	
	private static int serialNum = 10000;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}//Car()

	public int getCarNum() {
		return carNum;
	}//getCarNum()
	
	
	
}//Car