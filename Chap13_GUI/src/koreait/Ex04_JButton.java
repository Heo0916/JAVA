package koreait;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_JButton {

	public static void main(String[] args) {

		// 프레임 클래스 생성
		JFrame jf = new JFrame();
		
		// 컨테이너 클래스 생성
		JPanel jp = new JPanel();
		
		jf.setTitle("JButton 예제");

		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		
		jf.setBounds(100, 100, 300, 300);
		jf.setVisible(true);
		
	}

}
