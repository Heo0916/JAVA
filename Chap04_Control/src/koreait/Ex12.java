package koreait;

import java.util.Scanner;

/*
 * switch~case문(분기문)
 * - 식(정수 또는 char)을 사용해서 다중분기하는 명령문.
 * - jdk 1.7 버전 부터는 식에 String 사용이 가능.
 *   형식)
 *          switch(식 또는 값){
 *                case 값1:
 *                        실행문1; // 값1일때 실행문;
 *                        break; // 블럭 탈출(exit)
 *                case 값2:
 *                        실행문2; // 값2일때 실행문;
 *                        break;
 *                case 값3:
 *                        실행문3; // 값3일때 실행문;
 *                        break;
 *                default :
 *                        // 생략 가능.
 *                        값1~값3 이외의 값이 나온 경우 실행문;                        
 */
public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3숫자 중에서 하나를 선택하세요. ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력 받은 숫자는 1 입니다.");
			break;
		case 2:
			System.out.println("입력 받은 숫자는 2 입니다.");
			break;
		case 3:
			System.out.println("입력 받은 숫자는 3 입니다.");
			break;
	    default :
	    	System.out.println("1~3 이외의 숫자입니다.");
		}
		
		sc.close();
	}
				
		

	}


