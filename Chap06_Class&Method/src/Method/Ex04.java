package Method;

import java.util.Scanner;

/*
 * [문제] 연산자와 두 수를 입력을 받는다.
 *       덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을
 *       하는 메서드를 만들고 연산자에 따라 
 *       해당 메서드를 호출하여 연산을 하도록
 *       프로그램을 만들어 보세요.
 */
public class Ex04 {

	public static void sum(int su1, int su2) {
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
	}
	
	public static void sub(int su1, int su2) {
		System.out.println(su1 + " - " + su2 + " = " + (su1-su2));
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	public static void div(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
	public static void mod(int num1, int num2) {
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		System.out.print("( + , - , * , / , % )중 연사자를 입력해 주세요 : ");
		String oper = sc.next();
		
		if(oper.equals("+")){
			sum(num1, num2);
		}else if(oper.equals("-")) {
			sub(num1, num2);
		}else if(oper.equals("*")) {
			mul(num1, num2);
		}else if(oper.equals("/")) {
			div(num1, num2);
		}else if(oper.equals("%")) {
			mod(num1, num2);
		}else {
			System.out.println("입력한 연산자가 없습니다.");
		}
		
sc.close();
	}

}
