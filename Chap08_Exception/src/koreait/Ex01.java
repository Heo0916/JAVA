package koreait;

/*
 * 오류(error) 
 * - 컴파일 오류 : 문법적 오류
 * - 실행시간(run time) 오류
 *   => 프로그램으로 해결할 수 없는 오류 형태 ==> 예외(Exception)
 *   
 *   예외(Exception)
 *   - 실행 시간에 소프투웨어적 / 하드웨어적 측면에서
 *     문제가 발생하는 오류 형태를 의미.
 */

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int num1 = 10;
		int num2 = 0;
		
		int result = num1 / num2;  // 0으로 나눈 경우(error 발생)
		
		System.out.println("result ==> " + result);
		
		System.out.println("프로그램 종료");

	}

}
