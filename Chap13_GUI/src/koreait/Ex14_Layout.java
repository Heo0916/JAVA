package koreait;

import java.awt.GridLayout;

import javax.swing.*;


/*
 * GridLayout 배치관리자.
 * - 격자 모양의 레이아웃. 행과 열의 개념이 적용됨.
 * - 무조건 행이 기준이 됨.
 */

public class Ex14_Layout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("GridLayout 예제");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		JButton jb6 = new JButton("버튼6");
		
		// 화면 배치관리자를 변경하는 방법
		jp.setLayout(new GridLayout(2, 3));
		
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(jb1); jp.add(jb2); jp.add(jb3); jp.add(jb4);
		jp.add(jb5); jp.add(jb6);
		
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}

}
