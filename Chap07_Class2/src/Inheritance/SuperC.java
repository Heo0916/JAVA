package Inheritance;

/*
 * java의 다중 상속
 * 1. java는 원칙적으로 다중상속이 불가능함.
 *    - 단일 상속만 가능함. (class A extends B)
 *      예) class Sub extends Super { } (o)
 *          class Sub extends Super1, Super2 {  } (x)
 *    - c++은 다중상속 지원됨.
 * 2. 일정 부분 다중 상속을 지원하기 위해서
 *    인터페이스 개념을 도입함.
 *    예) class sub implements Inter01, Inter02 {  } (o)
 */
public abstract class SuperC {     // 추상클래스
	
	void display() {
		System.out.println("일반 메서드~~~");
	}
	
	abstract void display2(); // 추상메서드 

}
