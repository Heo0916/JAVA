package Method;

import java.util.Scanner;

public class Ex08 {
	
	// 2과목 총점을 구하는 메서드
	public int sum2(int k, int e) {
		return k+e;
	}
	// 3과목 총점을 구하는 메서드
	public int sum3(int k , int e, int m) {
		return k + e + m;
	}
	
	// 4과목 총점을 구하는 메서드
	public int sum4(int k , int e, int m , int s) {
		return k + e + m + s;
	}

	public static void main(String[] args) {
		
		Ex08  ex = new Ex08();
		
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
		System.out.println("2과목 총점 ==> " + ex.sum2(kor, eng) + "점");
		
		// 3과목 총점 메서드 호출
		System.out.println("3과목 총점 ==> " + ex.sum3(kor, eng, mat) + "점");
		
		// 4과목 총점 메서드 호출
		System.out.println("4과목 총점 ==> " + ex.sum4(kor, eng, mat, sci) + "점");
		
		sc.close();

	}

}
