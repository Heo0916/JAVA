package koreait;

/*
 * 스레드(Thread)?
 * - 프로세스를 작은 단위로 나누어 놓은 작업 단위.
 * - 스레드는 병행 처리를 지원한다.(멀티태스킹)
 * - 응용분야 : 게임, 채팅 등...
 * 
 * [스레드 클래스 작성 방법 - 2가지]
 * 1. Thread 클래스를 상속.
 *    1) Thread 클래스를 상속을 받는다.
 *    2) run() 메서드를 재정의 ==> 스레드 구현이라고 함.
 *    3) 스레드 클래스 객체 생성 ==> 실행
 *       참조변수.start() ==> 참조변수.run() (x)
 * 2. Runnable 인터페이스 구현.
 */

public class Thread1 extends Thread {     // 1-1) 
	
	@Override
	public void run() {        // 1-2)
		int i = 1;
		while(true) {
			System.out.println("i ==> " + i);
			i++;
		}
		
	}

	
}
