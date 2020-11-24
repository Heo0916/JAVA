package koreait;

import java.util.Scanner;

/*
 * [문제] 이름, 국어, 영어, 수학점수를 키보드로
 *       입력받아서 총점, 평균, 학점을 출력해보세요.
 *       조건1) Scanner 클래스를 이용하세요
 *       조건2) 평균은 소수점 이하 2자리까지만 출력
 */
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요.:");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요.:");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요. :");
		int mat = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요. :");
		int eng = sc.nextInt();
		
		//2. 총점과 평균, 학점을 구하자.
		
		int sum = kor + eng + mat;
		float avg = sum / 3.0f;
		
		//3. 성적 결과 화면에 출력하자.
		System.out.println(name+"님의 성적입니다.");
		System.out.println("총점은 :"+ sum);
		System.out.printf("평균은 : %.2f \n", avg );
		if(avg>=90) {
			System.out.println("학점은 A입니다.");
		}else if(avg>=80) {
			System.out.println("학점은 B입니다.");
		}else if(avg>=70) {
			System.out.println("학점은 C입니다.");
		}else if(avg>=60) {
			System.out.println("학점은 D입니다.");
		}else {
			System.out.println("학점은 F입니다.");
		}
	
		sc.close();
	}
	
}
