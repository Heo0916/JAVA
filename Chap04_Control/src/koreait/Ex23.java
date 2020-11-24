package koreait;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지방의 그램을 입력하세요");
		int a = sc.nextInt();
		System.out.print("탄수화물의 그램을 입력하세요");
		int b = sc.nextInt();
		System.out.print("단백질의 그램을 입력하세요");
		int c = sc.nextInt();
		
		int sum = 9 * a + 4 * b + 4 * c;
		
		System.out.println("총 칼로리는 : " + sum);
		sc.close();

	}

}
