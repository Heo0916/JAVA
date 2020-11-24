package koreait;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 입력한 숫자까지 합을 구합니다.");
		System.out.print("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		
		int odd = 0, even = 0;
		
		for(int i=1; i<=a; i++)
		{
			if(i%2==1) {
				odd += i;
			}else {
				even += i;
			}
		}
		System.out.println("홀수의 합계 : " + odd);
		System.out.println("짝수의 합게 : " + even);
		sc.close();
	}

}
