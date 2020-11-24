package koreait;

/*
 * 국어, 영어, 수학의 3과목 점수를 가지고,
 * 총점과 평균을 구하여 화면에 출력해 보세요.
 * (단, 평균은 소수점 이하 2자리까지만 출력)
 */
public class Ex03 {

	public static void main(String[] args) {
		//1. 변수 선언 및 각 과목의 점수를 할당.
		int kor = 94;   // 국어점수 변수
		int eng = 88;   // 영어점수 변수
		int mat = 92;   // 수학점수 변수
		
		//2. 총점을 구하자.
		int sum = kor + eng + mat;
		
		//3. 평균을 구하자.
		//총점 / 과목수
		float avg = sum / 3.0f;
		
		//4. 결과를 화면에 출력해 보자.
		System.out.println("국어점수 :" + kor + "점");
		System.out.println("영어점수 :" + eng + "점");
		System.out.println("수학점수 :" + mat + "점");
		System.out.println("총   점 :" + sum + "점");
		System.out.println("평   균 :" + avg + "점");
		System.out.printf("평   균 : %.2f점 \n", avg);
		}

}
