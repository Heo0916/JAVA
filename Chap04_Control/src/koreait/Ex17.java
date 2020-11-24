package koreait;

/*
 * for문(반복문)
 * - 조건이 참인 동안 반복실행하는 명령문.
 *   형식)
 *        for(초기식; 조건식; 증감식){
 *            반복 실행문;
 *            }
 *            
 * [for문 실행 순서]
 * 1. 초기식 : 처음에 한번만 수행(초기화)
 * 2. 조건식 : 조건이 참이면 반복, 거짓이면 탈출(exit)
 * 3. 수행문 : 반복대상인 반복실행문이 수행.
 * 4. 증감식 : 증가(++) 또는 감소(--) 
 */

public class Ex17 {

	public static void main(String[] args) {
		
		//[문제1]
		int sum = 0;
		for(int su=1; su<=100; su++)
		{
			sum += su;
		}
		System.out.println("1~100까지의 합은 : "+ sum);
		
		//[문제2]
		int even = 0, odd = 0;
		int su; //전역변수
		
		for(su=1; su<=100; su++)
		{
			if(su%2==1)
			{
				even += su;
			}else {
				odd += su;
			}
			} //for문 end
		System.out.println("짝수의 합은 :" + odd);
		System.out.println("홀수의 합은 :" + even);
	}

}
