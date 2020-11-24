package koreait;

import java.util.Scanner;

/*
 *  length : 배열의 크기를 반환(return)하는 속성.
 *           배열의 크기(길이)를 정수값으로 리턴.
 *           형식) 배열명.length
 *           예 ) int size = arr.length;
 */

public class Ex05 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		System.out.println("arr 배열의 크기 ==> " + arr.length);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 정수입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int k: arr) {
			System.out.println("arr 배열 요소 ==>" + k);
		}
		sc.close();
	}

}
