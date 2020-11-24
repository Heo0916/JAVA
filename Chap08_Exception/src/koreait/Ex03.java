package koreait;

/*
 * 예외처리
 * - 실행시간에 발생하는 예외(오류)를
 *   프로그램으로 처리한다는 의미.
 * - 관련 키워드  
 *   1. try ~ catch ~ finally 블럭
 *   2. throws 블럭
 */

/*
 *  1. try ~ catch ~ finally 블럭
 *     형식)
 *         try{
 *             예외가 발생될 가능성 있는 코드;
 *         }catch(예외클래스 참조변수) {
 *            참조변수 : 예외정보를 넘겨 받는 변수
 *         }finally {
 *           // 생략 가능
 *           예외와 상관없이 실행되는 코드;
 *         }
 */
public class Ex03 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		
		try {
			 result = num1 / num2;
		}catch(ArithmeticException e) {
			System.out.println("산술적 예외사 발생함.");
			System.out.println("예외정보 : " + e);
		}
		System.out.println("result ==> " + result);
		
		
		
		System.out.println("프로그램 종료");
	}

}
