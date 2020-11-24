package Work;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex01 {

	public static void main(String[] args) {

		JFrame jf = new JFrame("성적 처리");
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		JLabel jl1 = new JLabel("이름 : " );
		JTextField jtf1 = new JTextField(5);
		
		JLabel jl2 = new JLabel("국어 : ");
		JTextField jtf2 = new JTextField(2);
		
		JLabel jl3 = new JLabel("영어 : ");
		JTextField jtf3 = new JTextField(2);
		
		JLabel jl4 = new JLabel("수학 : ");
		JTextField jtf4 = new JTextField(2);
		
		JTextArea jta = new JTextArea(7,30);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		// 컨테이너를 패널에 올리기
		jp1.add(jl1); jp1.add(jtf1);
		
		jp2.add(jl2); jp2.add(jtf2);	
		jp2.add(jl3); jp2.add(jtf3);
		jp2.add(jl4); jp2.add(jtf4);
		
		jp3.add(jb1); jp3.add(jb2); jp3.add(jb3);
		
		JPanel jpg1 = new JPanel(new BorderLayout());
		JPanel jpg2 = new JPanel(new BorderLayout());
		
		jpg1.add(jp1, BorderLayout.NORTH);
		
		jpg2.add(jp2, BorderLayout.NORTH);
		jpg2.add(jsp, BorderLayout.CENTER);
		jpg2.add(jp3, BorderLayout.SOUTH);
		
		jf.add(jpg1, BorderLayout.NORTH);
		jf.add(jpg2, BorderLayout.CENTER);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		// 이벤트 처리
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name = jtf1.getText();
				int su1 = Integer.parseInt(jtf2.getText());
				int su2 = Integer.parseInt(jtf3.getText());
				int su3 = Integer.parseInt(jtf4.getText());
				
				int sum = su1+su2+su3;
				float avg = sum/3.0f;
				String result = name + "의 성적은 총점" + sum + "평균 " + avg+ "입니다.";
			jta.append(result + "\n");
			}
			
			
			
			
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText(null);
				jtf4.setText(null);
				jta.setText(null);
				jtf1.requestFocus();
				
			}
		});
		
	}

}
