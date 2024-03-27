package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
	
		
		/*
		예제)
		James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
		James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
		Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
		두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
		*/
		
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		Student Edward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Subway greenSubway = new Subway(2);
		Taxi goTaxi = new Taxi("잘나간다 운수");
		
		
		James.takeBus(bus100);
		Tomas.takeSubway(greenSubway);
		Edward.takeTaxi(goTaxi);
		
		bus100.showBusinfo();
		greenSubway.showSubwayinfo();
		goTaxi.showTaxiinfo();
		James.showInfo();
		Tomas.showInfo();
		Edward.showInfo();
	
	
	}//main

}//TakeTransTest
