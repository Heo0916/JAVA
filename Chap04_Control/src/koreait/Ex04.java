package koreait;

/*
 * if~else문 - 조건문
 * 형식)
 *     if(조건식) {
 *         조건식이 참인 경우 실행문;
 *     }else {
 *            조건문이 거짓인 경우 실행문;
 *     }
 */

public class Ex04 {

	public static void main(String[] args) {
		
		int su = 30;
		
		if(su >= 50) {
			System.out.println(su + "은 50 이상의 숫자입니다.");
		}else {
			System.out.println(su + "은 50 미만의 숫자입니다.");
		}

	}

}
