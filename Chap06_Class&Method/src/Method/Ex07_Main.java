package Method;

import java.util.Scanner;

/*
 * [문제] main() 메서드에서 키보드로 이름과 3과목의
 *       점수를 입력받는다.
 *       조건1) Ex07 클래스를 만들어서 총점과
 *             평균, 학점을 구하는 메서드를 만든다.
 *             총점 메서드에 3과목의 점수를 인자로 넘겨준다.
 *       조건2) 평균을 구하는 메서드에 총점을 넘겨준다.
 *       조건3) 학점을 구하는 메서드에 평균을 넘겨준다.
 *       조건4) Ex07 클래스에 prn() 메서드를 만들어서 
 *             이름과 3과목 점수, 총점, 평균, 학점을
 *             넘겨주에서 성적이 출력되도록 프로그램을 완성하세요.      
 */

public class Ex07_Main {

	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		String [] subject = new String[3];
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print("과목명 입력 : ");
			subject[i] = sc.next();
			
			System.out.print(subject[i] + "점수 입력 : ");
			arr[i] = sc.nextInt();
			
		}
		System.out.println();
		
		// 총점 메서드 호출
		int sum = ex.tot(arr);
		
		
		float avg = ex.avg(sum);
		
		String Score = ex.Score(avg);
		
		ex.prn(name, subject, arr, sum, avg, Score);
		sc.close();
		
		
		
		

	}

}
