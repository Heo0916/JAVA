package koreait;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 배열의 크기 입력 : ");
		String[] str = new String[sc.nextInt()];
		
		for(int i=0; i<str.length; i++) {
			System.out.print((i+1) + "번째 문자열 입력 : ");
			str[i] = sc.next();
			
		}
		System.out.println();
		
		// 배열에 저장된 문자열 출력.
		for(int i = (str.length-1); i>= 0; i--) {
			System.out.println("str[" + i + "] = " + str[i]);
		}
		
		// 배열에 저장된 문자열을 검색해 보자.
		System.out.print("검색할 문자열 입력 : ");
		String search = sc.next();
		
		//배열에서 검색해 보자.
		for(int i=0; i<str.length; i++) {
			if(search.equals(str[i])) {
				System.out.println("찾은 문자열 ==> " + str[i]);
				System.out.println("찾은 인덱스 ==> str[" + i + "]" );
			}
		}
		sc.close();

	}

}
