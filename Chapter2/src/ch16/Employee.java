package ch16;

public class Employee {
	
	private static int serialNum = 1000;

	private int employeeid;
	private String employeeName;
	private String deparment;
	
	public Employee() {
		serialNum++;
		employeeid = serialNum;
	}
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}


	public static int getSerialNum() {
		return serialNum;
	}
	
}//Employee
