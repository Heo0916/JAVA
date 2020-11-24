package koreait;

/*
 * 2. Runnable  인터페이스 구현 방법.
 *    1) Runnable 인터페이스 구현(implements)
 *    2) run() 메서드 재정의.
 *    3) 자식클래스로 객체 생성
 *    4) Thread 클래스 객체 생성.
 *       ==> Thread 생성자의 인자에 스레드클래스의 참조변수 사용.
 *    5) Thread 클래스의 참조변수.start()
 */

public  class Thread3 implements Runnable{ //2-1)

	@Override
	
		public void run() {        // 2-2)
			int i = 1;
			while(true) {
				System.out.println("i ==> " + i);
				i++;
			}
			
		}

}
