package ch05;

public class TestMethod {
	
	/*
	 05. 메서드 재정의와 가상 메서드 원리
	 
	 1. 메서드는 어떻게 호출되고 실행 되는가? 
		 - 메서드(함수)의 이름은 주소값을 나타냄 
		 - 메서드는 명령어의 set 이고 프로그램이 로드되면 메서드 영역(코드 영역)에 명령어 set이 위치 
		 - 해당 메서드가 호출 되면 명령어 set 이 있는 주소를 찾아 명령어가 실행된다. 
		 - 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치 하게된다.
		 - 따라서 다른 인스턴스라도 같은 메서드의 코드는 같으므로 같은 메서드가 호출된다. 
		 - 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만, 메서드 명령어 set은 처음 한번만 로드 된다.
	 */

	int num;

	void aaa() {
		System.out.println("aaa() 호출");
	}

	public static void main(String[] args) {

		TestMethod a1 = new TestMethod();
		a1.aaa();

		TestMethod a2 = new TestMethod();
		a2.aaa();

	}// main

}// TestMethod
