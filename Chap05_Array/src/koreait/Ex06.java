package koreait;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 키보드로 배열의 크기를 입력을 받자.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요. : ");
		//int size = sc.nextInt();
		
		String [] str = new String[sc.nextInt()];
		
		for(int i=0; i<str.length; i++) {
			System.out.print((i+1) + "번째 문자열 입력 : ");
			str[i] = sc.next();
			}
		
		for(String k : str) {
			System.out.println("str 배열 요소 ==> " + k);
		}
		
		sc.close();
	}

}
