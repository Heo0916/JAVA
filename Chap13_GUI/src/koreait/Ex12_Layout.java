package koreait;

import javax.swing.*;


/*
 * 배치관리자(Layout)
 * - 화면에 컴포넌트를 배치하는 방법.
 * - 배치관리자의 종류
 *   1) FlowLayout
 *   2) BorderLayout
 *   3) GridLayout
 */

/*
 *  FlowLayout 배치관리자.
 *  - 배치 : 좌 -> 우
 *  - 상단 중앙에 컴포넌트를 배치한다.
 *    화면이 넘칠 경우 바로 아래 중앙에 위치한다.
 *  - 가장 기본이 되는 배치관리자.  
 */
public class Ex12_Layout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("FlowLayout 예제");
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
		

	}

}
