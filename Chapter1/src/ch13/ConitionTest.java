package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 1 : \n");
		int num1 = scanner.nextInt();
		System.out.println("입력 2 : \n");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1 : num2 ;
		System.out.println("더 큰 수는 " + max + "입니다.");
		
	}

}
