package koreait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * C:/HDG/test/test.txt 파일을 읽어들이자.
 * - InputStream으로 읽어들일 경우 한글은 깨지는 현상이 발생을 한다.
 * - 따라서 이 방식은 오류 발생. 
 */

public class Ex06 {

	public static void main(String[] args) {
		
		int _byte = 0;
		// 파일을 읽어들이는 스트림
		try {
			FileInputStream fis = new FileInputStream("C:/HDG/test/test.txt");
			// 파일에 저장된 데이터가 몇글자인지 모르니까 
			// 무한 반복으로 처리해서 읽어들이자.
			while((_byte = fis.read()) != -1 ) {
				System.out.println((char)_byte);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
