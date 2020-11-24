package koreait;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 1. InputStream 만 사용한 경우
 * 
 * 2. BufferedinpuStream을 사용한 경우
 * 
 * 1번과 2번의 속도 차이
 */


public class Ex03 {

	public static void main(String[] args) {
		
		// 바이트 스트림만 사용한 경우.
		long start, end;
		try {
			FileInputStream fis = new FileInputStream("C:/1400_JAVA/koala.jpg");
			start = System.currentTimeMillis();
			
			// read() 메서드로 파일을 읽어 들이는데 
			//더 이상 읽을 파일이 없는 경우 -1값 반환 
			while(fis.read() != -1) {
				
			}
			end = System.currentTimeMillis();
			System.out.println("버퍼를 사용하지 않은 경우 시간 ==> " + (end-start) + "ms");
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 보조스트림을 사용한 경우
		try {
			FileInputStream fis1 = new FileInputStream("C:/1400_JAVA/koala.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis1);
			start = System.currentTimeMillis();
			while(bis.read() != -1) {
				
			}
			end = System.currentTimeMillis();
			System.out.println("버퍼를 사용한 경우 시간 ==> " +(end-start)+"ms");
			bis.close(); fis1.close(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
