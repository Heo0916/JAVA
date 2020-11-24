package koreait;

/*
 * [문제] Ex02 클래스의 에외가 발생.
 *       발생된 예외를 대상으로 try ~ catch 블럭을
 *       이용하여 예외를 처리하세요.
 */

public class Ex04 {

	public static void main(String[] args) {
		

		System.out.println("프로그램 시작");
		
		String str1 = "korea";
		String str2 = null;      // null : 값이 없는 상태
		
		try {
		System.out.println("str1 길이 ==> " + str1.length());
		System.out.println("str2 길이 ==> " + str2.length());  // 오류 발생
		}catch(NullPointerException e) {
			System.out.println("Null 값을 갖는 오류");
			System.out.println("예외정보 : " + e);
		}
		System.out.println("프로그램 종료");
	}

}
