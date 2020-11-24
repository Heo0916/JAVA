package koreait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 1. 바이트스트림 관련 클래스
 *    - 바이트스트림 방식으로 데이터를 입출력.
 *    - 1바이트 단위로 데이터를 읽어 들이는 바이트 기반 입출력 스트림.
 *    - 그림, 오디오, 텍스트 파일 등 모든 종류의 파일 처리가 가능.
 *    - xxxInputStream/ xxxOutputStream
 *     
 *     
 * 2. 문자스트림 관련 클래스
 *    - 문자스트림 방식으로 데이터를 입출력.
 *    - 2바이트 단위로 데이터를 읽어 들이는 문자 기반 입출력 스트림.
 *    - 문자 단위로 읽기 때문에 그림, 오디오 파일 처리가 불가능.
 *    - xxxReader / xxxWriter 
 *     
 *     
 * 3. 바이트스트림 -> 문자스트림으로 변환
 *   - 바이트스트림 데이터를 문자스트림 데이터로 변환.
 *   - xxxInputStreamReader / xxxOutputStreamWriter
 */

/*
 * 보조스트림 관련 클래스
 * - 스트림의 기능(속도)을 향상시키는 클래스.
 * - Bufferedxxx : 버퍼를 제공하는 보조 스트림.
 * - 버퍼(buffer) : CPU와 IO간의 속도 차이를 보완. 
 */

public class Ex02 {

	public static void main(String[] args) {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// 보조스트림을 이용하여 여러 개의 데이터를 입력을 받자.
		BufferedReader br = new BufferedReader(isr);
		System.out.print("문자열 입력하세요 : ");
		String str = null;
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력받은 문자열 ==> " + str);
	}

}
