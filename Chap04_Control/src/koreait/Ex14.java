package koreait;

import java.util.Scanner;

/*
 * [문제] 키보드로 두 수를 입력받고, 연산자를 입력받아서
 *       해당 연산자의 연산을 수행하는 프로그램을 
 *       작성하세요.
 */
public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자를 입력하세요");
		System.out.print("***** +,-,*,%,/ 중 입력하세요 ******");
		String opr = sc.next();
		System.out.print("첫 번째 수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요");
		int num2 = sc.nextInt();
		
		switch(opr) {
		case "+":
			System.out.printf("연산자 +이면 : %d \n", num1 + num2);
			break;
		case "-":
			System.out.printf("연산자 -이면 : %d \n", num1 - num2);
			break;
		case "*":
			System.out.printf("연산자 *이면 : %d \n", num1 * num2);
			break;
		case "/":
			System.out.printf("연산자 /이면 : %d \n", num1 / num2);
			break;
		case "%":
			System.out.printf("연산자 %이면 : %d \n", num1 % num2);
			break;
			default :
				System.out.println("입력한 연산자가 없습니다.");
		}
		sc.close();	
		
		

	}

}
