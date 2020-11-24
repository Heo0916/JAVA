package koreait;

import javax.swing.*;

public class Ex11_JTextField {

	public static void main(String[] args) {

		JFrame jf = new JFrame("종합 예제");
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("아이디 : ");
		JTextField jtf1 = new JTextField(10);
		
		JLabel jl2 = new JLabel("비미런호 : ");
		JPasswordField jpf = new JPasswordField(10);
		
		JLabel jl3 = new JLabel("하고 싶은 말 : ");
		JTextArea jta = new JTextArea(5, 30);
		
		JScrollPane jsp = new JScrollPane(
				jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// JTextArea 자동 줄바꿈 기능 제공하는 메서드.
		jta.setLineWrap(true);
		
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(jl1); jp.add(jtf1);
		jp.add(jl2); jp.add(jpf);
		jp.add(jl3); jp.add(jsp);
		
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		jf.setBounds(100, 100, 250, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}
	}
		