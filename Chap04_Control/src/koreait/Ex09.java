package koreait;

import java.util.Scanner;

/*
 * 키보드로 데이터를 입력받는 방법(4가지)
 * 1. main(String[] args)를 이용하는 방법
 * 2. JOptionPane 클래스를 이용하는 방법 - GUI방식(Chap13)
 * 3. Scanner 클래스를 이용하는 방법
 * 4. 파일 입출력 관련 클래스를 이용하는 방법(Chap11)
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// Scanner 클래스 이용하여 키보드로 입력받는 방법
		// System.in : 표준입력장치(키보드)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 메뉴를 선택하세요. ***");
		System.out.println("1. Pizza");
		System.out.println("2. 돈까스");
		System.out.println("3. 제육볶음");
		System.out.println("4. 짜장면");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		
		// nextInt(): 키보드로 숫자값을 입력받을 때 사용하는 메서드
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("Pizza 선택");
			}else if(menu ==2) {
				System.out.println("돈까스 선택");
			}else if(menu == 3) {
				System.out.println("제육볶음 선택");
			}else if(menu == 4) {
				System.out.println("짜장면 선택");
			}else {
				System.out.println("선택한 메뉴가 없습니다.");
			}
		
		//키보드로 입력을 받으면 반드시 닫아주어야 한다.
		sc.close();

	}

}
