package ch14;

public class Taxi {

	/*
	앞의 예제에서 Edward는 지각을 해서 택시를 타야 했습니다. 
	20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
	택시는 '잘나간다 운수' 회사 택시를 탔습니다.
	*/
	
	String TaxiName;
	int money;
	
	public Taxi(String TaxiName) {
		this.TaxiName = TaxiName;
	}
	
	public void take(int money) {
		this.money += 10000;
	}
	
	public void showTaxiinfo() {
		System.out.println(TaxiName + " 의 수입은 " + money +"입니다.");
	}
	

}//Taxi