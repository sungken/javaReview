package ch02;

public class CostomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		customerLee.showCustomerInfo();
		
		VIPCustomer customerJ = new VIPCustomer();
		
		customerJ.setCustomerName("지성근");
		customerJ.setCustomerID(20010);
		customerJ.bonusPoint = 50000;
		customerJ.setAgentID("마돈나");
		
		customerJ.showCustomerInfo();
		
		
	}//main

}//CostomerTest
