package Method;

/*
 * 1. 변수 : 프로그램이 끝날 때까지 언제든지 변할 수 있는 속성(데이터).
 *          -> 소문자로 시작
 * 2. 상수 : 프로그램이 끝날 때까지 절대 변하지 않는 속성(데이터).
 *          -> 모든 글자가 대문자.
 * 3. instance(인스턴스) 변수/메서드 : 객체의 생성과 동시에 만들어지는 변수/메서드.
 *                                객체나 인스턴스는 Heap 메모리에 만들어짐.
 *                                반드시 객체 생성 후 사용이 가능함.
 *                                호출방법 : 참조변수.변수, 참조변수.메서드()
 * 4. static(정적) 변수/메서드 : 객체의 생성과 상관없이 만들어지는 변수/메서드/.
 *                           static 메모리(Method 영역)에서 별도로 만들어짐.
 *                           공용, 하나만 생성됨.
 *                           객체를 생성하지 않아도 어느 클래스나 사용이 가능함.
 *                           호출방법 : 클래스이름.변수, 클래스이름.메서드()  
 */

public class Ex05 {

	int su = 100;          // 인스턴스 변수(멤버변수)
	static int num = 500;  // static 변수
	
	public void sum() {    // 인스턴스 메서드
		System.out.println("결과 ==> " + su);
	}
	
	public static void add(int su1, int su2) {   //static 메서드
		System.out.println("덧셈 : " + (su1 + su2));;
	}
}
