package ch06;

public class Customer {

	/*
	일반 고객(Customer) 클래스 구현
		- 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
		- 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
	 */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusdRatio;
	
//	public Customer() {
//		
//		customerGrade = "SILVER";
//		bonusdRatio = 0.01;
//		
//		System.out.println("Customer() Call");
//	}
	
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusdRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusdRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		
		if(customerGrade == "SILVER") {
			
			System.out.printf("%s님의 등급은 '%s'이며, 보너스 포인트는 %d입니다.\n"
					,customerName, customerGrade, bonusPoint);
		} else {
			System.out.printf("%s님의 등급은 '%s'이며, 보너스 포인트는 %d입니다.\n"
					,customerName, customerGrade, bonusPoint);
		}
	}//showCustomerInfo()
	
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
	
	
	
	
	

}// Customer
