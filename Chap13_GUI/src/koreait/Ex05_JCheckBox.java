package koreait;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_JCheckBox {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JPanel jp = new JPanel();
		
		jf.setTitle("JCheckBox 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JCheckBox jcb1 = new JCheckBox("운동", true);
		JCheckBox jcb2 = new JCheckBox("게임");
		JCheckBox jcb3 = new JCheckBox("여행");
		JCheckBox jcb4 = new JCheckBox("숨쉬기");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		
		jp.add(jcb1); jp.add(jcb2); jp.add(jcb3);
		jp.add(jcb4);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		jf.setVisible(true);
		

	}

}
