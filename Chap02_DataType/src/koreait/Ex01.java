package koreait;

/*
 * java 기본 자료형(8가지)
 * 1. 정수형 : byte(1바이트), short(2바이트),
 *           int(4바이트 - 기본형), long(8바이트)
 * 2. 실수형 : float(4바이트), double(8바이트-기본형)
 * 3. 단일문자형 : char(1~2바이트)
 * 4. 논리형 : boolean(ture/false)
 * 
 * 나머지 자료형은 클래스형 - 5장부터 나옴.
 * 예) String name = "홍길동";
 */
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10); // 정수형 숫자(int 형)
		System.out.println(10.7845); //실수형 숫자(double형)
		System.out.println('A'); //단일문자형(char)
		System.out.println(true); //논리형(boolean 형)
		System.out.println(10L); // 정수형 숫자(long형)
		System.out.println(10.7f); //실수형 숫자(float형)
	}

}
