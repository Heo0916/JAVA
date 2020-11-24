package koreait;

/*
 *  제어문( Control)?
 *  - 프로그램의 흐름을 제어하는 명령문.
 *  1. 분기문(조건문)
 *     - if문, if~else문, switch~case문
 *  2. 반복문
 *     - while문, do~while문, for문
 *  3. 기타
 *     - break, continue
 */

/*
 * if문 - 조건문
 * - 조건을 제시하고 참이면 실행하고, 거짓이면 무시함.
 *   형식)
 *        if(조건식) {
 *           조건식이 참인 경우 실행문; 
 *           }
 */
public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int num = 10;
		
		if(num >= 50) {
			System.out.println("조건식은 참입니다.");
			System.out.println("해당 숫자는 50 이하의 숫자입니다.");
		}
		
		System.out.println("프로그램 종료");
		
		

	}

}
