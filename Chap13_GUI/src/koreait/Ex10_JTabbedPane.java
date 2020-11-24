package koreait;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ex10_JTabbedPane {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("JTabbedPane 예제");
		
		JTabbedPane tab = new JTabbedPane();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("첫번째 탭입니다.");
		JLabel jl2 = new JLabel("여기는 두번째 탭입니다.");
		JLabel jl3 = new JLabel("이 공간은 세번째 탭입니다.");
		
		// 2. 컴포넌트를 컨테이너에 올려보자.
		jp1.add(jl1);
		jp2.add(jl2);
		jp3.add(jl3);
		
		// 3. 탭에 컨테이너를 추가 및 이름 설정
		tab.add("First", jp1);
		tab.add("Second", jp2);
		tab.add("Thired", jp3);
		
		// 4. 탭을 프레임에 올려주자.
		jf.add(tab);
		
		jf.setBounds(100, 100, 300, 200);
		
		// 프레임에서 창닫기 버튼 활성화 시킴.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
