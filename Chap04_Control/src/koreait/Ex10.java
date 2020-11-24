package koreait;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. :");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요. :");
		int age = sc.nextInt();
		
		System.out.print("주소를 입력하세요. :");
		String address = sc.next();
		
		//키보드로 입력 받은 값을 화면에 출력해 보자.
		System.out.println("이 름: "+ name);
		System.out.println("나 이:" + age);
		System.out.println("주 소:" + address);
		
		sc.close();

	}

}
