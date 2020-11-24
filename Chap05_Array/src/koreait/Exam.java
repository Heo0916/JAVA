package koreait;

import java.util.Scanner;

/*
 * 정렬 작업
 * 키보드로 5개의 숫자를 무작위로 입력.
 * 배열에 저장을 하자.
 * 예) 43, 19, 67, 6, 91
 */

public class Exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 입력 : ");
		int [] arr = new int [sc.nextInt()];
		
		//1. 키보드로 숫자 5개를 입력받아서 배열에 저장하자.
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//2. 배열의 데이터를 내림차순으로 정렬해 보자.
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// 3. 정렬된 내용을 화면에 출력해 보자.
		System.out.println("*** 내림차순 정렬 ***");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		sc.close();
	}

}
