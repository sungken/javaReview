package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge;
		
		if(age <= 7) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		else if(age < 14){
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age < 17){
			charge = 2300;
			System.out.println("중학생 입니다.");
		}
		else if(age < 20){
			charge = 2500;
			System.out.println("고등학생 입니다.");
		}
		else{
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		
	
	}

}
