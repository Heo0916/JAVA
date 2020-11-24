package koreait;

import javax.swing.JOptionPane;

/*
 * GUI 방식으로 이름, 국어, 영어, 수학, 점수를
 * 입력받아서 총점, 평균, 학점을 출력해 보자.
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		int kor = Integer.parseInt(JOptionPane.showInputDialog(null, "국어점수를 입력하세요."));
		int eng = Integer.parseInt(JOptionPane.showInputDialog(null, "영어점수를 입력하세요."));
		int mat = Integer.parseInt(JOptionPane.showInputDialog(null, "수학점수를 입력하세요."));
		// 총점을 구하자.
				int sum = kor + eng + mat;
				
				//평균을 구하자.
				float avg = sum / 3.0f;
				
				//학점을 구하자.
				String grade;
				
				if(avg >= 90) {
					if(avg >= 95) {
						grade = "A+ 학점";
					}else {
						grade = "A학점";
					}
				}else if(avg >= 80) {
					grade = "B학점";
				}else if(avg >= 70) {
					grade = "C학점";
				}else if(avg >= 60) {
					grade = "D학점";
				}else {
					grade = "F학점";
				}
				
				// 성적을 화면에 출력해 보자.
				System.out.println("***" + name + "님 성적결과 ***");
				System.out.println("이      름 :" + name);
				System.out.println("국어 점수 : "+ kor + "점");
				System.out.println("영어 점수 : "+ eng + "점");
				System.out.println("수학 점수 : "+ mat + "점");
				System.out.println("총     점 : "+ sum + "점");
				System.out.printf("평     균 : %.2f점 \n", avg);
				System.out.println("학    점 :" + grade);
	}

}
