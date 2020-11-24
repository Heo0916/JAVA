package koreait;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex07 {

	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/HDG/test/test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			byte[] _byte = new byte[1024];
			bis.read(_byte);
			System.out.write(_byte);
		
			bis.close(); fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
