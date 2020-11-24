package koreait;

import java.io.IOException;

/*
 * java에서 입출력 방식
 * - 스트림 개념을 사용한다.
 * - 스트림(stream) : 순서가 있는 일련의 연속된 데이터.
 * - 스트림의 종류.
 *   1. 바이트 스트림 : 1바이트 단위로 데이터를 입출력(byte)
 *   2. 문자 스트림 : 2바이트 단위로 데이터를 입출력(char)
 * - java 입출력 관련 클래스 : java.io 패키지에 존재함.
 * - checked 방식의 예외 처리.
 */

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.print("한 문자를 입력하세요 : ");
		int num = 0;
		try {
			// System.in : 표준입력장치(키보드)
			// read() : 1바이트의 데이터를 읽음.
			//          1바이트로 읽으면 ASCII 코드(숫자)로 리턴
			num = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("읽어온 데이터(ASCII) ==> " + num);
		System.out.println("읽어온 데이터(문자) ==> " + (char)num);

		
	}

}








