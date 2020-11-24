package koreait;

/*
 * 이항연산자/ 단항연산자
 * - 이항연산자 : 2개의 항을 대상으로 연산을 수행.
 * - 단항연산자 : 1개의 항을 대상으로 연산을 수행.
 *   1) 전위연산자 : 연산자가 변수 앞에 온다. (++su1)
 *   2) 후위연산자 : 연산자가 변수 뒤에 온다. (su++)
 *   주의) 단항연산자와 배정연산자가 동시에 적용된 경우,
 *        전위연산자의 우선순위가 높고,
 *        후위연산자의 우선순위는 낮다.
 */

public class Ex04 {

	public static void main(String[] args) {
		// 이항연산자
		int mod = 5 % 3; // mod = 2
		System.out.println("mod ==>"+ mod);
		
		// 단항연산자
		int su = 10; 
		int num = su++;  // su 변수의 값을 하나 증가시키라는 의미.
		System.out.println("num ==>"+ num);
		
		int su1 = 10;
		int num1 = ++su1;
		System.out.println("num1 ==>" + num1);

	}

}
