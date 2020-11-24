package Util;

import java.util.Scanner;

/*
 * 2. Math 클래스
 *    - 수학 관련 메서드를 제공해 주는 클래스.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// 1. max() - 최대값을 구해 주는 메서드 
		// 2. min() - 최소값을 구해 주는 메서드
		// max() 나 min() 메서드는 비교할 때 두 수만 가지고 비교
		/*Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 : ");
		int s1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int su2 = sc.nextInt();
		
		System.out.println("최대값 ==> " + Math.max(s1, su2));
		
		System.out.println("최소값 ==> " + Math.min(s1, su2));
		System.out.println();*/ // 전체주석 ctrl + shift + /
		
		// 3. round() - 반올림 적용하는 메서드.
		System.out.println(125.5124);
		System.out.println(Math.round(125.5124));
		
		// 4. abs() - 절대값을 구하는 메서드.
		System.out.println("abs ==> " + Math.abs(-15235.41));

	}

	
	
	
	
}
