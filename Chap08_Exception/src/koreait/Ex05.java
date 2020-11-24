package koreait;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 다중 catch문
 * - catch문을 여러 개 사용하여 처리하는 방식.
 * - catch문은 순차적으로 수행된다.
 * - 예외를 처리하는 가장 상위의 Exception 클래스는
 *   맨 마지막에 올 수 있다.
 *   (만약 첫 문장에 오는 경우 error 발생)
 */

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String str = "korea";
		int [] arr = {10, 20, 30, 40, 50};
		
		try {
			
			System.out.print("점수를 입력하세요 : ");
			num = sc.nextInt();
			System.out.println("입력한 점수 : " + num);
			
			System.out.println("str 길이 ==> " + str.length());
			
			num = num / 10;
			arr[5] = 100;
			}catch(InputMismatchException e1) {
				System.out.println("타입 불일치 예외 발생");
				System.out.println("예외정보 : " + e1);
			}catch(NullPointerException e2) {
				System.out.println("값이 없는 예외 발생");
				System.out.println("예외정보 : " + e2);
			}catch(ArithmeticException e3) {
				System.out.println("산술적 예외 발생");
				System.out.println("예외정보 : " + e3);
			}catch(Exception e4) {
				System.out.println("모르는 예외 발생");
				System.out.println("예외정보 : " + e4);
			}finally {
				sc.close();
			}
		
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
