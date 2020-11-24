package koreait;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex15_Layout {

	public static void main(String[] args) {

		JFrame jf = new JFrame("계산기-1 예제");
		JPanel jp1 = new JPanel();          // North
		JPanel jp2 = new JPanel();          // Center
		JPanel jp3 = new JPanel();          // South
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField jtf1 = new JTextField(3);
		
		JLabel jl2 = new JLabel("수 2 : ");
		JTextField jtf2 = new JTextField(3);
		
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField jtf3 = new JTextField(1);
		
		JTextArea jta = new JTextArea(5, 30);
		JScrollPane jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);  // 자동 줄바꿈 기능 제공
		
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp1.add(jl1);  jp1.add(jtf1);
		jp1.add(jl2);  jp1.add(jtf2);
		jp1.add(jl3);  jp1.add(jtf3);
		
		// jp2 컨테이너에 컴포넌트를 올리자.
		jp2.add(jsp);
		
		// jp3 컨테이너에 컴포넌트를 올리자.
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jp2, BorderLayout.CENTER);
		jf.add(jp3, BorderLayout.SOUTH);
		
		jf.setBounds(100, 100, 350, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.pack();
		
		jf.setVisible(true);
		
		
		
	}

}
