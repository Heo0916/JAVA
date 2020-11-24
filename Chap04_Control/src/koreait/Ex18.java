package koreait;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력받은 수까지의
 *       홀수의 합과 짝수의 합을 구하여
 *       화면에 출력해 보세요.
 */
public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~원하는 숫자까지 홀수의 합과 짝수의 합을 출력합니다.");
		System.out.printf("원하는 숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		int even = 0, odd = 0 ;
		
		for(int su = 0; su <= num; su++)
		{
			if(su%2==1) {
				even+=su;
			}else{
				odd+=su;
			}
		}
		System.out.println("1부터"+ num +"까지의 짝수의 합은 : " + odd);
		System.out.println("1부터"+ num +"까지의 홀수의 합은 : " + even);
		
		sc.close();
	}

}
