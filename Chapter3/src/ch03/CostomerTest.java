package ch03;

public class CostomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint = 1000;
		
		customerLee.showCustomerInfo();
		
		//-------------------------------------
		/*
		
		하위클래스가 생성이 될때 항상 상위 클래스가 먼져 생성이 된다.
		아무것도 없으면 디폴트로 슈퍼가 불려져 디폴트 콘스트럭터가 생긴다.
		(상위에도 콘스트럭트가 없고 하위에도 없다 할 경우는 양쪽다 디폴트 콘스트럭스가 생기면서 하위에서 super호출)
		
		그런데 매개변수가 있는 콘스트럭터는(컴파일러가 자동으로 컴파일 해줄수 있는 콘스트럭스가 없을겨우)
		직접 명시하여 콘스트럭트를 호출한다.
		
		
		
		*/
		//-------------------------------------
		
		VIPCustomer customerJ = new VIPCustomer(20010, "지성근");
		
		customerJ.bonusPoint = 50000;
		customerJ.setAgentID("마돈나");
		
		customerJ.showCustomerInfo();
		
		Customer customerA = new VIPCustomer(20011, "noname");
		customerA.bonusPoint = 50000;
		
		// 업캐스팅으로 인해 Customer에 VIPCustomer가 생성된경우 
		// Customer에서 사용하는 instance밖에 사용하지 못한다
		// 고로 VIPCustomer의 instance를 전부 사용하고 싶으면 다운캐스팅을 해줘야 한다.
//		customerA.setAgentID("마돈나"); 
		customerA.showCustomerInfo();
		
	}//main

}//CostomerTest
