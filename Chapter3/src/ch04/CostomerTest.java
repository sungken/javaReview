package ch04;

public class CostomerTest {

	public static void main(String[] args) {
		
		/*
		메서드 재정의하기(overring)
		- 오버라이딩(overriding): 
			상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
			하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있다.
		- VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않는다.
		- 재정의 하여 구현해야 한다.
		
		*/

		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		customerLee.showCustomerInfo();
		System.out.println(price);
		
		VIPCustomer customerJ = new VIPCustomer(20010, "지성근");
		
		customerJ.bonusPoint = 50000;
		customerJ.setAgentID("마돈나");
		price = customerJ.calcPrice(1000);
		
		customerJ.showCustomerInfo();
		System.out.println(price);
		
		//업캐스팅 부분
		Customer customerA = new VIPCustomer(20011, "noname");
		customerA.bonusPoint = 50000;
		price = customerA.calcPrice(1000);
		customerA.showCustomerInfo();
		System.out.println(price);
		
	}//main

}//CostomerTest
