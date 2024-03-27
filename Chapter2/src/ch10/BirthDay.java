package ch10;

public class BirthDay {
	/*
	
	클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
	private : 같은 클래스 내부에서만 접근 가능 ( 외부 클래스, 상속 관계의 클래스에서도 접근 불가)
	아무것도 없음 (default) : 같은 패키지 내부에서만 접근 가능 ( 상속 관계라도 패키지가 다르면 접근 불가)
	protected : 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
	public : 클래스의 외부 어디서나 접근 할 수 있음
	
	
	*/

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	
	
	/*
	get()/ set() 메서드
	- private 으로 선언된 멤버 변수 (필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
	- get() 메서드만 제공 되는 경우 read-only 필드
	- 이클립스에서 자동으로 생성됨
	 */
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12 ) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
	
	
	
	
	
	
}//BirthDay