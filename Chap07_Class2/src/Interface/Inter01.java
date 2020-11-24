package Interface;

/*
 * 인터페이스(Interface)?
 * 1. 완벽한 추상화를 제공한다.
 * 2. 클래스와 클래스 사이의 중계적 역할을 
 *    하는 서비스를 제공한다.
 * 3. 모든 메서드가 추상화(추상메서드)이다.
 * 4. 프로젝트 진행 시 표준 규약을 따른다.
 *    -> 추상클래스보다 더 많이 사용됨.
 * 5. 인터페이스는 상수와 추상메서드로만 구성됨.
 * 6. 모든 변수는 상수로 사용된다.
 *    예) public static final로 인식.
 * 7. 모든 메서드는 추상메서드로 통용된다.
 *    예) public abstract로 인식.
 * 8. 인터페이스는 객체 생성이 불가능.
 * 9. 자식클래스로 상속하여 자식으로 객체 생성.
 *    -> 인터페이스의 추상메서드는 반드시 재정의.
 * 10. 인터페이스는 다중 상속을 제공함.
 * 11. class -> interface 키워드 사용.
 *     extends -> implements 키워드 사용.
 */

public interface Inter01 {     // 인터페이스
    // 상수가 됨.
	int num = 10;      // 멤버변수
	
	
	 void display();    // 추상메서드
	 void display2();   // 추상메서드
	
	
}
