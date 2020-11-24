package Util;

import java.util.Random;

/*
 * Util 패키지 주요 클래스
 * 1. Random 클래스
 *    - 임의의 난수를 발생시키는 클래스.
 * 2. Math 클래스
 *    - 수학 관련 메서드를 제공해 주는 클래스.
 * 3. Calendar 클래스
 *    - 날짜 / 시간 정보를 제공해 주는 클래스.
 *    
 */
/*
 * 1. Random 클래스.
 *    - 지정한 범위 내에서 임의의 난수를 발생.
 *    - 활용분야 : 게임, 확률 등에서 활용.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = 0;
		int [] lotto = new int[6];
		
		// 중복 발생 코드
		for(int i = 0; i< 6; i++) {
			// 형식) nextInt(가장 큰 값) + 시작 값
			// 1~45 사이의 난수 발생
			num = r.nextInt(45) + 1;
			System.out.print(num + "\t");
		}
		System.out.println();
		
		// 중복이 발생되지 않게 로또 만들자.
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			if(i > 0) {
				for(int j = 0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						lotto[i] = r.nextInt(45) + 1;
						j = -1;
					}
				}
			}
			System.out.print(lotto[i] + "\t");
		}
System.out.println();
	}

}
