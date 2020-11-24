package koreait;

/*
 * break문
 * - 현재의 제어문을 빠져나가는 명령문.
 * - 보통 switch~case문과 반복문에서 사용된다.
 * - if문을 제외한 첫번째 블럭에서 빠져나가는 명령어이다.
 */
public class Ex21 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i >= 11) {
				break;
			}
			System.out.println("i ==> " + i);
		}
		int i = 0;
		for(;;) { // 무한반복
			System.out.println("for문 무한 반복");
			i++;
			if(i >= 10) {
				break;
			}
		}
		
	}

}
