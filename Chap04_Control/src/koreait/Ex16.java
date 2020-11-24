package koreait;

/*
 * [문제 1] while문으로 1~100까지의 합을 
 *         구하여 화면에 출력해 보세요.
 *         
 * [문제 2] while문으로 1~100까지의
 *         홀수의 합과 짝수의 합을 구하여
 *         화면에 출력해 보세요.
 */
public class Ex16 {

	public static void main(String[] args) {
		
		//1~100까지의 합 [문제1]
		int num = 1; //반복문에서 초기식
		int num2 = 0; //숫자를 누적시키는 변수
		
		while(num <= 100) {
			num2 += num;
			num++;
		}
		System.out.println("1~100까지의 합은 = "+ num2);
		//[문제2]
		//홀수의 합 구하는 방법
		int su = 1; //반복문에서 초기식
		int odd = 0, even=0; 
		while(su <= 100) {
			if(su %2 == 1) {
				odd+=su;
			}else {
				even+=su;
			}
			su++;
		}
		
		System.out.println("홀수의 합은 ="+odd);
		
		
		System.out.println("짝수의 합은 ="+even);
	}

}
