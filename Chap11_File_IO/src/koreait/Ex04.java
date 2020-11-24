package koreait;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 * - 파일 및 디렉토리를 생성하는 클래스.
 * - 파일 입출력 시 사용됨.
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// C:/LJH/test 폴더 생성
		// C:/LJH/test.txt 파일을 생성
		
		// 1. 폴더 생성
		File dir = new File("C:/HDG/test");
		if(!dir.exists()) {
			dir.mkdirs();  // 실제로 폴더를 생성해 줌.
		}
		// 2. 파일 생성
		// 형식) newFile(폴더경로, "파일명")
		File file = new File(dir, "test.txt");
		if(!file.exists()) { // 파일이 존재하지 않는다면
			try {
				file.createNewFile();// 실제로 파일을 만들어 줌.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		}

	}

}








