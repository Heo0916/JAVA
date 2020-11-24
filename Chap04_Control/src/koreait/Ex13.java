package koreait;

import java.util.Scanner;

/*
 * [문제] Ex09 예제를 switch ~ case 문을로
 *       바꾸어 화면에 출력해 보세요.
 */
public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 메뉴를 선택하세요. ***");
		System.out.println("1. Pizza");
		System.out.println("2. 돈까스");
		System.out.println("3. 제육볶음");
		System.out.println("4. 짜장면");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("선택하신 메뉴는 Pizza 입니다.");
			break;
		case 2 :
			System.out.println("선택하신 메뉴는 돈까스 입니다.");
			break;
		case 3 :
			System.out.println("선택하신 메뉴는 제육볶음 입니다.");
			break;
		case 4 :
			System.out.println("선택하신 메뉴는 짜장면 입니다.");
			break;
		default :
			System.out.println("선택하신 메뉴는 없습니다.");
		}
	sc.close();

	}

}
