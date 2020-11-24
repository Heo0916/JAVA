package Method;

import java.util.Scanner;

/*
 *  메서드 다중정의(Method Overloading)
 *  1. 동일한 클래스에서 동일한 이름의 메서드가
 *  여러 개 정의되는 자바 문법.
 *  2. 일관된 메서드 이름을 정의할 수 있어서
 *  개발자(사용자)에게 코드의 직관성을 제공해 줌.
 *  
 *  [메서드 다중정의 규칙]
 *  1. 메서드 이름이 동일함
 *  2. 반드시 매개변수는 데이터 타입 또는 매개변수의 갯수가 달라야 함.
 *  2. 리턴타입은 무관함.
 */
public class Ex09 {
	
	// 2과목 총점을 구하는 메서드
		public int sum(int k, int e) {
			return k+e;
		}
		// 3과목 총점을 구하는 메서드
		public int sum(int k , int e, int m) {
			return k + e + m;
		}
		
		// 4과목 총점을 구하는 메서드
		public int sum(int k , int e, int m , int s) {
			return k + e + m + s;
		}

	public static void main(String[] args) {
		
Ex09  ex = new Ex09();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		System.out.print("과학 점수 입력 : ");
		int sci = sc.nextInt();
		
		// 2과목 총점 메서드 호출
		System.out.println("2과목 총점 ==> " + ex.sum(kor, eng) + "점");
		
		// 3과목 총점 메서드 호출
		System.out.println("3과목 총점 ==> " + ex.sum(kor, eng, mat) + "점");
		
		// 4과목 총점 메서드 호출
		System.out.println("4과목 총점 ==> " + ex.sum(kor, eng, mat, sci) + "점");
		
		sc.close();

	}

}
