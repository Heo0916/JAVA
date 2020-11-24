package koreait;

import java.util.Scanner;

/*
 * [문제] 키보드로 5개의 정수를 입력 받아서 배열에 저장하시오.
 *       조건1) Scanner 클래스를 이용하여 키보드로
 *             5개의 정수를 입력받을 것.
 *       조건2) 일반 for문과 개선된 for문을 이용하여
 *             배열에 저장된 내용을 화면에 출력해 보세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1단계 + 2단계 : 배열 선언 및 배열 메모리 공간 확보
		int [] arr = new int[5];
		
		// 3단계 : 배열의 초기화 작업 - 키보드로 5개의 정수 입력
		for(int i=0; i<5; i++) {
			System.out.print((i+1) +"번째 정수를 입력해 주세요 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		// 4단계 : 배열에 저장된 내용을 화면에 출력해 보자.
		for(int j=0; j<5; j++) {
			System.out.println((j+1) +" 번째 정수는 : " + arr[j]);
			}
		System.out.println();
		
		// 개선된 for문으로 출력해 보자.
		for(int k : arr) {
			System.out.println("입력한 정수 출력 ==>" + k);
		}
		sc.close();
	}

}
