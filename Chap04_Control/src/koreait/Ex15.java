package koreait;

/*
 *  1. While문 (반복문)
 *     -조건식을 비교하여 참인 경우 계속하여
 *      반복실행문을 실행하는 문장.
 *     -초기식, 조건식, 증감식이 반드시 따라 다님.
 *      형식)
 *          while(조건식) {
 *               반복 실행문;
 *           }
 *           
 * 2. do~while문(반복문)
 *    형식)
 *        do {
 *            반복 실행문;
 *          }while(조건식);
 */

public class Ex15 {

	public static void main(String[] args) {
		
		System.out.println("num ==> 1");
		System.out.println("num ==> 2");
		System.out.println("num ==> 3");
		System.out.println("num ==> 4");
		System.out.println("num ==> 5");
		System.out.println("num ==> 6");
		System.out.println("num ==> 7");
		System.out.println("num ==> 8");
		System.out.println("num ==> 9");
		System.out.println("num ==> 10");
		
		System.out.println();
		
		//1. while 문으로 1~10까지 출력해 보자.
		int num = 1;            // 반복문에서 초기식
		while(num <= 100) { //반복문에서 조건식
			System.out.println("num ==>" + num);
			num++;          //반복문에서 증감식
			}
		System.out.println();
		
		//2. do~while 문으로 1~10까지 출력해 보자.
		int su = 1;       // 반복문에서 초기식
		
		do {
			System.out.println("su ==>" + su);
			su++;              //반복문에서 증감식
		}while(su <= 10);      //반복문에서 조건식
	}

}
