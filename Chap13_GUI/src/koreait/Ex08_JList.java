package koreait;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex08_JList {

	public static void main(String[] args) {

		JFrame jf = new JFrame("JList 예제");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		String[] hobby = {"게임","운동","여행", "숨쉬기"};
		JList<String> list = new JList<String>(hobby);
		
		// 초기값을 설정하는 방법(2가지)
		list.setSelectedIndex(1);
		list.setSelectedValue("여행", true);
		
		
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(list);
		
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setVisible(true);
		
	}

}
