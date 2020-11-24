package koreait;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex16_Layout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("계산기-2 예제" );
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField jtf1 = new JTextField(10);
		
		JLabel jl2 = new JLabel("수 2 : ");
		JTextField jtf2 = new JTextField(10);
		
		JLabel jl3 = new JLabel("연산자 : ");
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		JRadioButton jrb5 = new JRadioButton("%");
		
		// 버튼 그룹의 라디오 버튼을 추가해 주어야 한다.
		bg.add(jrb1); bg.add(jrb2); bg.add(jrb3); bg.add(jrb4); bg.add(jrb5);

		JTextArea jta = new JTextArea(7, 30);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);      // 자동줄바꿈
		
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		// jp1 컨테이너에 컴포넌트를 올리자.
		jp1.add(jl1); jp1.add(jtf1);
		jp1.add(jl2); jp1.add(jtf2);
		
		// jp2 컨테이너에 컴포넌트를 올리자.
		jp2.add(jl3); jp2.add(jrb1); jp2.add(jrb2); jp2.add(jrb3);
		jp2.add(jrb4); jp2.add(jrb5);
		
		// jp3 컨테이너에 컴포넌트를 올리자.
		jp3.add(jb1); jp3.add(jb2); jp3.add(jb3);
		
		// 컨테이너 두 개를 더 만들어 보자.
		JPanel pg1 = new JPanel(new BorderLayout());
		JPanel pg2 = new JPanel(new BorderLayout());
		
		pg1.add(jp1, BorderLayout.NORTH);
		pg2.add(jp2, BorderLayout.NORTH);
		pg2.add(jsp, BorderLayout.CENTER);
		pg2.add(jp3, BorderLayout.SOUTH);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(pg1, BorderLayout.NORTH);
		jf.add(pg2, BorderLayout.CENTER);
		
		jf.setBounds(100, 100, 350, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
		
		
	}

}
