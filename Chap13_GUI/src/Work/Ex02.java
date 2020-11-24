package Work;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ex02 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("커피 자판기");
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		
		JLabel jla1 = new JLabel("원하는 커피 선택");
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("아메리카노(2500)");
		JRadioButton jrb2 = new JRadioButton("카페모카(3500)");
		JRadioButton jrb3 = new JRadioButton("에스프레소(2500)");
		JRadioButton jrb4 = new JRadioButton("카페라떼(4000)");
		
		bg.add(jrb1); bg.add(jrb2); bg.add(jrb3); bg.add(jrb4);
		
		JLabel jla2 = new JLabel("수량 : ");
		JTextField jtf2 = new JTextField(7);
		JLabel jla3 = new JLabel("입금액 : ");
		JTextField jtf3 = new JTextField(7);
		
		JTextArea jta = new JTextArea(7, 30);
		
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton jbu1 = new JButton("계산");
		JButton jbu2 = new JButton("종료");
		JButton jbu3 = new JButton("취소");
		
		jp1.add(jla1); 
		
		jp2.add(jrb1); jp2.add(jrb2); jp2.add(jrb3); jp2.add(jrb4); 
		
		jp3.add(jla2); jp3.add(jtf2);
		jp3.add(jla3); jp3.add(jtf3);
		
		jp4.add(jbu1); jp4.add(jbu2); jp4.add(jbu3);
		
		JPanel jpg1 = new JPanel(new BorderLayout());		
		JPanel jpg2 = new JPanel(new BorderLayout());
		JPanel jpg3 = new JPanel(new BorderLayout());

		jpg1.add(jp1, BorderLayout.NORTH);
		jpg2.add(jp2, BorderLayout.NORTH);
		jpg3.add(jp3, BorderLayout.NORTH);
		jpg3.add(jsp, BorderLayout.CENTER);
		jpg3.add(jp4, BorderLayout.SOUTH);
		
		jf.add(jpg1, BorderLayout.NORTH);
		jf.add(jpg2, BorderLayout.CENTER);
		jf.add(jpg3, BorderLayout.SOUTH);
		
		jf.setBounds(100, 100, 600, 600);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.pack();
		
		jf.setVisible(true);
	
		//이벤트처리
		jbu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int su1 = Integer.parseInt(jtf2.getText());
				int su2 = Integer.parseInt(jtf3.getText());
				String co = null;
				int mo = 0;
				String result1 = null;
				String result2 = null;
				String result3 = null;
				String result4 = null;
				String result5 = null;
				String result6 = null;
				String result7 = null;
				String result8 = null;
				if(jrb1.isSelected()) {
					co = "아메리카노(2500)";
					mo = 2500;
					result1 = "커피종류 : " + co;
					result2 = "커피단가 : " + mo;
					result3 = "커피수량 : " + su1;
					result4 = "공급가액 : " + (mo*su1);
					result5 = "부가세액  : " + (mo*su1)/10;
					result6 = "총 금 액 : " + ((mo*su1)+ (mo*su1)/10);
					result7 = "입 금 액 : " + su2;
					result8 = "거스름돈 : " + (su2-((mo*su1)+ (mo*su1)/10))	;				
					jta.append(result1 + "\n");
					jta.append(result2 + "\n");
					jta.append(result3 + "\n");
					jta.append(result4 + "\n");
					jta.append(result5 + "\n");
					jta.append(result6 + "\n");
					jta.append(result7 + "\n");
					jta.append(result8 + "\n");
					
					
				}
				if(jrb2.isSelected()) {
					co = "카페모카(3500)";
					mo = 3500;
					result1 = "커피종류 : " + co;
					result2 = "커피단가 : " + mo;
					result3 = "커피수량 : " + su1;
					result4 = "공급가액 : " + (mo*su1);
					result5 = "부가세액  : " + (mo*su1)/10;
					result6 = "총 금 액 : " + ((mo*su1)+ (mo*su1)/10);
					result7 = "입 금 액 : " + su2;
					result8 = "거스름돈 : " + (su2-((mo*su1)+ (mo*su1)/10))	;				
					jta.append(result1 + "\n");
					jta.append(result2 + "\n");
					jta.append(result3 + "\n");
					jta.append(result4 + "\n");
					jta.append(result5 + "\n");
					jta.append(result6 + "\n");
					jta.append(result7 + "\n");
					jta.append(result8 + "\n");
					
				}
				if(jrb3.isSelected()) {
					co = "에스프레소(2500)";
					mo = 2500;
					result1 = "커피종류 : " + co;
					result2 = "커피단가 : " + mo;
					result3 = "커피수량 : " + su1;
					result4 = "공급가액 : " + (mo*su1);
					result5 = "부가세액  : " + (mo*su1)/10;
					result6 = "총 금 액 : " + ((mo*su1)+ (mo*su1)/10);
					result7 = "입 금 액 : " + su2;
					result8 = "거스름돈 : " + (su2-((mo*su1)+ (mo*su1)/10))	;				
					jta.append(result1 + "\n");
					jta.append(result2 + "\n");
					jta.append(result3 + "\n");
					jta.append(result4 + "\n");
					jta.append(result5 + "\n");
					jta.append(result6 + "\n");
					jta.append(result7 + "\n");
					jta.append(result8 + "\n");
					
				}
				if(jrb4.isSelected()) {
					co = "카페라떼(4000)";
					mo = 4000;
					result1 = "커피종류 : " + co;
					result2 = "커피단가 : " + mo;
					result3 = "커피수량 : " + su1;
					result4 = "공급가액 : " + (mo*su1);
					result5 = "부가세액  : " + (mo*su1)/10;
					result6 = "총 금 액 : " +((mo*su1)+ (mo*su1)/10);
					result7 = "입 금 액 : " + su2;
					result8 = "거스름돈 : " + (su2-((mo*su1)+ (mo*su1)/10))	;				
					jta.append(result1 + "\n");
					jta.append(result2 + "\n");
					jta.append(result3 + "\n");
					jta.append(result4 + "\n");
					jta.append(result5 + "\n");
					jta.append(result6 + "\n");
					jta.append(result7 + "\n");
					jta.append(result8 + "\n");
					
				}
				
			
			}		
		});
		
		jbu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		jbu3.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jtf2.setText("");
				jtf3.setText(null);
				jta.setText(null);
				jtf2.requestFocus();
				
			}
		});
	}
}
