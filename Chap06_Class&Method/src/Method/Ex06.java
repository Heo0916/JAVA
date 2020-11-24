package Method;

import java.util.Scanner;

public class Ex06 {

	// 상수값을 리턴한 예
	public int method1() {
		return 370;
	}
	
	// 변수를 리턴한 예
	public int method2(int a1, int a2) {
		int sum = a1+a2;
		return sum;
		}
	
	// 수식을 리턴한 예
	public int method3(int s1, int s2) {
		return s1 + s2;
	}
	 // String 문자열을 리턴한 예
	public String method4() {
		return "홍길동";
	}
	// String 변수를 리턴한 예
	public String method5(String s1, String s2) {
		String result = s1 + s2 ;
		return result;
	}
	// String 결합을 리턴한 예
	public String method6(String a1, String a2) {
		return a1 + a2;
	}
	
	// 총점 구하는 메서드
	public int tot() {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];
		int sum=0;
		for(int a = 0; a < arr.length; a++) {
			System.out.print(a+1 + "번째 점수 입력해 주세요 : ");
			arr[a] = sc.nextInt();
		}
		for(int a = 0; a < 3; a++) {
			sum += arr[a];
		}
		sc.close();
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		// Ex06 클래스 객체 생성
		Ex06 ex = new Ex06();
		
		// int su = ex.method1();
		System.out.println("method1() 호출 결과 ==> " +  ex.method1());
		System.out.println("method2() 호출 결과 ==> " +  ex.method2(200,130));	
		System.out.println("method3() 호출 결과 ==> " +  ex.method3(50, 40));
		System.out.println("method4() 호출 결과 ==> " +  ex.method4());
		System.out.println("method5() 호출 결과 ==> " +  ex.method5("대한", "민국"));
		System.out.println("mehtod6() 호출 결과 ==> " +  ex.method6("유", "관순"));

		
		/*
		 * [문제1] 3개의 과목 점수를 키보드로 입력 받아서 
		 *        총점을 리턴하는 메서드를 만들어 보세요.
		 *        (3과목의 점수는 배열로 받을 것)
		 * [문제2] 리턴 받은 총점을 대상으로 평균을 구해 보세요.
		 *        (소수점 2자리 까지만 출력해 볼 것).
		 */
	
		int sum = ex.tot();
		System.out.println("총점 ==> " + sum);
		
		float avg = sum / 3.0f;
		System.out.printf("평균 ==> %.2f점 \n", avg);
		
		
	}
	

}
