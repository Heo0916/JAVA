package koreait;

import java.awt.Frame;

/*
 * GUI 용어 
 * 1. 컴포넌트 : 버튼, 텍스트상자, 레이블상자, 
 *            옵션/체크박스 등을 생성하는 클래스.
 * 2. 컨테이너 : 컴포넌트를 담는 클래스.
 *             -> 컴포넌트는 컨테이너에 올려져야 볼 수 있음.
 * 3. 프레임 : 컨테이너를 담는 클래스.
 */

/*
 * Frame을 만드는 방법 - 2가지
 * 1 Frame 클래스를 상속을 받아서
 *   생성자를 통해 Frame을 보여주기
 */

public class Ex01_Frame extends Frame{

	public Ex01_Frame() {
		// 제목
		super("첫번째 예제");
		
		// 프레임의 위치 - setLocation()
		setLocation(100, 100);
		
		// 프레임의 크기 - setSize()
		setSize(300, 300);
		
		// 프레임을 화면에 보여주어야 함.
		// 프레임을 보여주는 메서드 - setVisible(기본값-false)
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		
		new Ex01_Frame();

	}

}
