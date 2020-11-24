package Inner;

/*
 * 다양한 형태의 클래스 선언
 * 1. 일반적인 선언 방법.
 *    - 하나의 java 파일에 class 키워드로 클래스 선언.
 * 2. 무명 클래스(Anonymous Class) 선언
 *    -> 이름이 없는 클래스 선언, interface 객체 생성.
 * 3. 중첩 클래스 선언.
 *    -> 클래스 안에 또 다른 클래스 선언   
 */
public interface Inter {
	
	// 상수 + 추상메서드로만 구성
	// 직접 객체 생성이 불가능 => 자식으로 객체 생성
	int sum(int n1, int n2);         // 추상메서드
	int minus(int n1, int n2);       // 추상메서드 

}
