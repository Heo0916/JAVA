package koreait;

import java.util.Scanner;

//내가 여행가고 싶은 5개 나라 키보드로 입력을 받자.

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 선언 및 배열 메모리 할당해 보자.
		String[] nation = new String[5];
		
		// 배열에 초기값을 할당해 보자.
		for(int i=0; i<5; i++) {
			System.out.print((i+1) +"번째 나라 입력 : ");
			nation[i] = sc.next();
		}
		
		// 배열에 저장된 나라를 출력해 보자.
		System.out.println("*** 내가 입력한 나라 ***");
		for(int i=0; i<5; i++) {
			System.out.print(nation[i] + "\t");
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.println("nation[" + i + "] =" + nation[i]);
		}
		
		/*
		 * 개선된 for문(단축 for문)
		 * - java jdk 1.5 버전부터 추가된 기능.
		 * - 주로 배열의 요소(원소)를 출력할 때 사용됨.
		 *   형식)
		 *       for(type 변수명 : 배열명) {
		 *           반복 수행문;
		 *           }
		 *   실행)
		 *   - 배열의 첫번째 원소를 좌변의 변수에 할당하여 
		 *     원소의 수만큼 자동 반복하여 실행함.
		 *   주의) 
		 *   - 우변의 배열명의 데이터 타입과 좌변의 데이터 타입은
		 *     반드시 일치해야 함.
		 *   - 일치하지 않을 경우 error 발생.        
		 */
		
		for(String k : nation) {
			System.out.println("nation 나라 ==> " + k);
		}

		sc.close();
	}
}
