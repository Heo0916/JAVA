package koreait;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class Ex09_JTable {

	public static void main(String[] args) {
		
		
		JFrame jf = new JFrame("JTable 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		String[] header = {"학생이름", "국어점수" , "영어점수", "수학점수"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 :");
		String[][] contents = new String[sc.nextInt()][4];
		
		for(int i = 0; i< contents.length; i++) {
			System.out.print("학생 이름 입력 :");
			contents[i][0] = sc.next();
			System.out.print("국어 점수 입력 : ");
			contents[i][1] = sc.next();
			System.out.print("영어 점수 입력 : ");
			contents[i][2] = sc.next();
			System.out.print("수학 점수 입력 : ");
			contents[i][3] = sc.next();
		}
		
		JTable table = new JTable(contents, header);
		JScrollPane jsp = new JScrollPane(
				table,         // 스크롤바가 보여질 컴포넌트를 지정
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // 수직 스크롤바 생성 여부
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);  // 수평 스크롤바 생성 여부
				
		
		// 2. 컴포넌트를 프레임에 올리자.
		jf.add(jsp);
	
		jf.setBounds(100, 100, 200, 200);
		
		jf.setVisible(true);
		
		sc.close();
		
		

	}

}
