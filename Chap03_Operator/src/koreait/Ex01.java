package koreait;

/*
 * 연산자의 종류
 * 1. 산술연산자.
 * 2. 관계연산자.
 * 3. 논리연산자.
 * 4. 이항연산자/단항연산자
 * 5. 3항연산자
 * 6. 배정연산자/단축배정연산자
 */

/*
 * 산술연산자.
 * - 덧셈(+), 뺄셈(-), 곱셈(*), 나누셈(/), 나머지(%)
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int su1 = 10, su2 = 3, result;
		
		//덧셈연산
		result = su1 + su2; //result = 13;
		System.out.println("덧셈 ==>" + result);
		//뺄셈연산
		result = su1 - su2; //result = 7;
		System.out.println("뺄셈 ==>"+ result);
		//곱셈연산
		result = su1 * su2; //result = 30;
		System.out.println("곱셈 ==>" + result);
		//나눗셈연산
		result = su1 / su2; //result = 3;
		System.out.println("나눗셈(몫) ==>" + result);
		
		//나머지 연산
		result = su1 % su2; //result = 1;
		System.out.println("나머지 ==>" + result);
		
		/*
		 * % 연산자 활용
		 * - 나머지를 구하는 연산자.
		 * - 짝수, 홀수 판별 시 사용.
		 * - 배수 판별 시 사용.
		 */
		
		
	}

}
