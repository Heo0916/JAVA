package koreait;

/*
 * synchronized 키워드
 * - 스레드의 동기화와 관련된 명령어.
 * - 멀티스레드에 의해서 공유된 메서드나 클래스를 
 *   대상으로 임계영역(Critical Section)을 설정.
 * - 임계영역으로 설정된 메서드는 가장 먼저 도착한
 *   스레드가 완전히 종료될 때까지 나머지 스레드는 대기함.
 */

public class Exam {

	public static void main(String[] args) {
		
		ATM atm = new ATM(0);
		
		// User 클래스를 대상으로 멀티스레드로 객체 생성.
		User u1 = new User(atm, "홍길동");
		User u2 = new User(atm, "이순신");
		User u3 = new User(atm, "유관순");
		User u4 = new User(atm, "김유신");
		User u5 = new User(atm, "김연아");
		
		// 멀티스레드 실행.
		u1.start(); u2.start(); u3.start();
		u4.start(); u5.start();

	}

}
