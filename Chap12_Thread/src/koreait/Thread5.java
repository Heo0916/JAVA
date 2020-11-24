package koreait;

/*
 * 멀티스레드와 스레드 이름 지정
 * 1. 멀티스레드 : 하나의 스레드 클래스를 대상으로 
 *              2개 이상의 스레드 객체를 생성하는 기법.
 * 2. 스레드 이름 지정 : 멀티스레드에서 생성된 스레드 
 *                   객체에 이름을 부여하는 과정.
 *                   형식) super(name);
 * - 멀티스레드는 자신의 이름을 가지고 있음.
 * - 스레드의 이름이 큰 역할을 하지는 않지만, 디버깅 시
 *   어떤 스레드가 작업하는지를 조사할 목적으로 많이 사용됨.
 */
public class Thread5 extends Thread {
	
	public Thread5() {
	}
	public Thread5(String name) {
	     super(name);
	}
	@Override
	public void run() {
		System.out.println(this.getName());
		// getName() : 현재 run() 메서드를 실행 중인
		//             스레드의 이름을 반환.
	}

}
