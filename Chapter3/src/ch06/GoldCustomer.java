package ch06;

public class GoldCustomer extends Customer {
	
	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		saleRatio = 0.1;
		bonusdRatio = 0.02;
		customerGrade = "GOLD";
	
	}//GoldCustomer
	
	public int calcPrice(int price){
		bonusPoint += price * bonusdRatio;
		return price - (int)(price * saleRatio);
	}//calcPrice
	
public void showCustomerInfo() {
		
		if(customerGrade == "GOLD") {
			
			System.out.printf("%s님의 등급은 '%s'이며, 보너스 포인트는 %d입니다.\n"
					,customerName, customerGrade, bonusPoint);
		}
	}//showCustomerInfo()


}//GoldCustomer extends Customer
