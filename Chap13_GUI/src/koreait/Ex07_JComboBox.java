package koreait;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_JComboBox {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("JComboBox 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		String[] hobby = {"게임","운동","여행", "숨쉬기"};
		JComboBox<String> jcb = new JComboBox<String>(hobby);
		
		// 디폴트 값을 설정하는 방법(2가지)
		//jcb.setSelectedItem("여행");
		jcb.setSelectedIndex(1);
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(jcb);
		
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setVisible(true);
		
		

	}

}
