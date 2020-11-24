package koreait;

/*
 * 관계연산자
 * - >=(크거나 같다), (크다), <=(작거나같다),
 *   <(작다), ==(같다), !=(같지 않다)
 * - 관계연산의 결과값은 참(true) 아니면 거짓(false)로 나온다.
 */

/*
 * 3항연산자
 * - 3개의 항을 대상으로 연산을 수행.
 *   형식)
 *        (조건) ? 수식1 : 수식2;
 *                => 수식1 : 해당 조건이 참인 경우 실행문;
 *                => 수식2 : 해당 조건이 거짓일 경우 실행문;
 */

public class Ex02 {

	public static void main(String[] args) {
		int su1= 10 , su2 = 3;
		
		boolean test = (su1 >= su2);
		
		System.out.println("결과 ==>" + test);
		
		// String 자료형: 문자열을 저장하는 변수
		String result = (su1 >= su2) ? "ture" : "false";
		System.out.println("결과 ==>" + result);
		
		
	}

}
