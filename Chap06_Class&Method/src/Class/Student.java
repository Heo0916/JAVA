package Class;

/*
 * 1. 클래스를 대상으로 객체 생성 과정
 *    형식) 클래스이름 참조변수 = new 클래스명(); ==> (X)
 *         클래스이름 참조변수 = new 생성자();  ==> (O)
 *         
 * 2. 생성자(Constructor)?
 *    1) 클래스를 대상으로 객체를 생성하는 역할.
 *    2) 클래스 이름과 동일.
 *    3) 클래스에 포함되어 있으며, 객체를 생성할 때 자동으로 딱 한번만 호출됨.
 *    4) 클래스는 생성자를 통해 객체로 생성이 된다.
 *       생성자 형식)
 *                [접근제한] 생성자이름(매개변수 혹은 인자) {
 *                         실행문;
 *                }
 *    5) 메서드 형태를 갖는다.
 *       -> 리턴타입(반환형)(X), void(X), 매개변수(O)
 *    6) 모든 클래스는 반드시 1개 이상의 생성자를 갖는다.
 *    7) 사용자가 생성자를 정의하지 않으면, JVM이 컴파일 시점에서
 *       자동으로 기본생성자를 만들어 줌.
 * 3. 생성자의 목적 : 멤버변수(변수, 상수)들의 초기화를 목적으로 사용됨.
 * 4. 생성자의 특징
 *    1) 생성자이름 == 클래스이름
 *    2) 메서드와 다르게 변환형이 없음.
 *    할 수 있음).
 *    5) 생성자가 보이지 않으면 기본생성자가 숨어 있음.
 *    3) 클래스는 반드시 한 개 이상의 생성자를 가지고 있음.
 *    4) 생성자 오버로딩이 가능(즉, 여러 개의 생성자가 존재
 *    6) 기본생성자라 함은 매개변수가 없는 생성자를 뜻함.
 *    7) 기본생성자 외의 다른 생성자를 만들면, 숨어 있던 기본생성자는 사라짐.
 *    8) 기본생성자 외의 다른 생성자를 만들면, 무조건 기본 생성자를 만들어 줄 것.
 *       (만들지 않으면 상속에서 문제가 발생함. - 상속에서 추후 설명 예정)
 */

public class Student {
	
	// 멤버변수
	int hakbun;          // 학생 학번
	String name;         // 학생 이름
	String major;        // 학생 학과
	int age;             // 학생 나이
	String address;      // 학생 주소

	public Student() {  } // 기본생성자
	
	public Student(int h, String n, String m, int a1, String a2) {
		hakbun = h;
		name = n;
		major = m;
		age = a1;
		address = a2;
	}
	// 멤버메서드
	void display() {
		System.out.println("학  번 : " + hakbun);
		System.out.println("이  름 : " + name);
		System.out.println("학  과 : " + major);
		System.out.println("나  이 : " + age);
		System.out.println("주  소 : " + address);
	}
}
