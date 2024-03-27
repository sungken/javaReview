package ch19;

public class CarFactory {
	
	private static CarFactory insrance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(insrance == null) {
			insrance = new CarFactory();
		}
		return insrance;
	}//getInstance()
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}//createCar()
	
	
	
	
}//CarFactory