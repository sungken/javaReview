package ch04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c = "";
        
        for (int i=0; i<a.length(); i++){
            int b = a.charAt(i);
            if (b >= 65 && b <= 90){
                c += (char)Character.toLowerCase(b);
            } else if (b >= 97 && b <= 122){
                c += (char)Character.toUpperCase(b);
            }
        }
        
        System.out.print(c);
    
    }
}
