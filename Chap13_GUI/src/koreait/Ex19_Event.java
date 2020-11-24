package koreait;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * Event Hander(이벤트 핸들러)
 * - 각 컴포넌트에 대하여 특정 행위를 하였을 때 
 *   그것에 대한 작업을 처리할 수 있도록 하는 것.
 *   -> 에를 든다면 버튼이 눌렸다던지,
 *      리스트 메뉴를 선택하였다던지 등등...
 * - 이벤트 발생 : ActionEvent
 * - 이벤트는 리스너를 통해서 처리가 됨.
 *   이벤트 리스너는 xxxxListener(리스너들은 모두 인터페이스) 
 */

/*
 * 무명 클래스(Anonymous Class)를 이용한 이벤트 처리.
 * - 코드의 집중화로 가독성이 높아진다.
 * - 별도의 상속 과정이 필요가 없어진다.
 */

public class Ex19_Event {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("이벤트 처리-1");
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("입력");
		JButton jb2 = new JButton("종료");
		
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(jb1); jp.add(jb2);
		
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp, BorderLayout.SOUTH);
		
		jf.setBounds(100, 100, 200, 200);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 입력(jb1) 버튼을 클릭했을 때 이벤트 처리
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jb1, "입력 버튼을 클릭 하셨군요.");
				System.out.println("입력 버튼을 클릭 하셨습니다.");
			}
		});
		// 종료(jb2) 버튼을 클릭했을 때 이벤트 처리
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 시스템을 종료시키는 메서드
				System.exit(0);
				
			}
		});

	}

}
