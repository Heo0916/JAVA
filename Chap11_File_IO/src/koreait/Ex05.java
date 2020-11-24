package koreait;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
	
		try {
			FileWriter fw = new FileWriter("C:/HDG/test/test.txt");
			
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("**************");
			bw.newLine();       // 다음 줄로 이동 - 강제로 이동
			bw.write("코리아IT학원");
			bw.newLine();
			bw.write("F강의실");
			bw.newLine();
			bw.write("JAVA-2 방특 수업");
			bw.newLine();
			bw.write("모두 취업합시다~화이팅");
			bw.newLine();
			bw.write("**************");
			bw.newLine();
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
