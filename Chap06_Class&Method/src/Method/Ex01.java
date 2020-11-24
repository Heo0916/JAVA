package Method;

/*
 *  메서드(Method)?
 *  1. C 언어에서의 함수(function) 와 같음.
 *  2. 기능을 정의하는 단위(예 : 덧셈기능, 뺄셈기능)
 *  3. 하나의 기능만을 정의하는 것이 좋음.
 *  4. 자주 반복되는 내용을 정의해 놓고, 필요 시 호출하여 사용한다.
 *     형식) 
 *         [접근제한] 반환명 메서드이름[매개변수 혹은 인자) {
 *                  실행문;
 *         }
 *         
 *  - 접근제한 : public > protected > default > private
 *            (클래스, 변수, 메서드 모두 동일하게 적용됨)
 *            가. public : 누구나 다, 아무나, 공용, 누구든지 접근 가능.
 *            나. protected : 같은 패키지, 다른 패키지는 상속관게일 때 접근 가능.
 *            다. default : 같은 패키지에서만 접근 가능. 상속도 접근 안됨(생략 가능)
 *            라. private : 외부에서 접근 불가. 멤버(필드, 메서드)끼리만 접근 가능.
 *  - 반환형(리턴타입) : - 메서드에서 실행된 결과를 되돌려주는 자료형(type)으로 생략 불가.
 *                   - 해당 메서드가 어떤 동작이나 기능을 실행한 후 결과를 나타내는 자료형.
 *                   - 메서드를 호출한 곳으로 결과를 되돌려 줄 때 사용하는 자료형.
 *                   - 만약에 결과를 되돌려 줄 필요가 없는 경우 void 라는 키워드 사용.
 *                   - 반환형이 void인 경우를 제외하고 결과를 되돌려줄 때에는 메서드 
 *                     명령문 맨 끝에 return 이라는 키워드와 함께 반환형과 같은 자료형으로
 *                     결과를 돌려보낸다.
 * - 메서드 이름 : 식별자, 소문자로 시작, 두 단어가 결합된 경우 
 *             두 번째 글자의 첫글자는 대문자로 표기(관례).
 * -  매개변수 : 외부에서 값을 넘겨받는 변수. 생략 가능.
 * -  실행문 : 메서드가 호출된 경우에만 실행함.     
 */
public class Ex01 {

	public static void method() {
		System.out.println("메서드가 호출 되었습니다.");
	}
	
	public static void add() {
		System.out.println(20 + " + " + 10 + " = " + (20+10));
	}
	public static void minus() {
		System.out.println(20 + " - " + 10 + " = " + (20-10));
	}
	public static void di() {
		System.out.println(20 + " / " + 10 + " = " + (20/10));
	}
	public static void id() {
		System.out.println(20 + " % " + 15 + " = " + (20%15));
	}
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		method();        // method() 이름을 가진 메서드를 호출.
		add();           // add() 이름을 가진 메서드를 호출.
		minus();
		di();
		id();
		
		System.out.println("프로그램 종료");
		

	}

}
