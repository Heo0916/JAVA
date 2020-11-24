package koreait;

public class Ex02 {

	public static void main(String[] args) {
		
		// Thread5 클래스를 대상으로 멀티 스레드 객체 생성.
		Thread5 t1 = new Thread5("첫번째 스레드");
		Thread5 t2 = new Thread5("두번째 스레드");
		Thread5 t3 = new Thread5("세번째 스레드");
		Thread5 t4 = new Thread5("네번째 스레드");
		Thread5 t5 = new Thread5("다섯번째 스레드");
		Thread5 t6 = new Thread5("여섯번째 스레드");
		
		t1.start(); t2.start(); t3.start();
		t4.start(); t5.start(); t6.start();

	}

}
