package Test;

import java.util.Scanner;
public class a와b출력하기 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.");
        System.out.println("제한사항은 -100,000 ≤ a, b ≤ 100,000 입니다.");
        
        if ( -100000 <= a) {
        	System.out.println("a = " + a);
        } 
        else {
        	System.out.println("-100000 <= a <= 100000 의 수가 아닙니다.");
        }

        	if ( b <= 100000) {
        		System.out.println("b = " + b);
        	} 
        	else {
        		System.out.println("-100000 <= b <= 100000 의 수가 아닙니다.");
        	}
	}
}