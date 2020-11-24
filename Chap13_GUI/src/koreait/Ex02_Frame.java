package koreait;

import java.awt.Frame;

/*
 * Frame을 만드는 방법 - 2번째 
 * - Frame 클래스 객체 생성하여 Frame 클래스 작성.
 */
public class Ex02_Frame {

	public static void main(String[] args) {
		
		Frame f = new Frame("두번째 예제");
		
		// 프레임 위치
		//f.setLocation(100, 100);
		
		// 프레임의 크기
		//f.setSize(300, 300);
		
		// 프레임의 위치 + 프레임의 크기를 한꺼번에 지정
		f.setBounds(100, 100, 300, 300);
		
		// 프레임을 화면에 보여 주기.
		f.setVisible(true);

	}

}
