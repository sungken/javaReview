package ch03;

public class VIPCustomer extends Customer {
	

	/*
	우수 고객(VIPCustomer) 구현
		- 매출에 더 많은 기여를 하는 단골 고객
		- 제품을 살때 10%를 할인해 줌
		- 보너스 포인트는 제품 가격의 5%를 적립해 줌
		- 담당 전문 상담원이 배정됨
	 */
	
	// Customer 클래스에 추가해서 구현하는 것은 좋지 않음
	// VIPCustomer 클래스를 따로 구현
	// 이미 Customer에 구현된 내용이 중복되므로 Customer를 확장하여 구현함(상속)
	
	double salesRatio;
	private String agentID;
	
	
//	public VIPCustomer() {
//		
//		super(0, "no-name");
//		customerGrade = "VIP";
//		bonusdRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() Call");
//	}//VIPCustomer
	
	//------------------------------------------------------
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusdRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) Call");
		
	}//VIPCustomer


	public String getAgentID() {
		return agentID;
	}


	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
public void showCustomerInfo() {
		
		if (customerGrade == "VIP") {
			
			System.out.printf("%s님의 등급은 '%s'이며, 보너스 포인트는 %d입니다. "
							+ "담당 상담원은 %s 입니다.\n"
							,customerName, customerGrade, bonusPoint, agentID);
		}
	}//showCustomerInfo()

}//VIPCustomer
