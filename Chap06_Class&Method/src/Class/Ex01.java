package Class;

/*
 * 클래스(Class)?
 * 1. 클래스는 객체를 만들기 위한 설계도(틀, 도면)이다.
 * 2. 자바는 클래스 단위로 프로그래밍을 한다.
 * 3. 클래스를 구성하는 것을 멤버(member)라고 한다.
 * 4. 멤버 = 속성(멤버변수, 멤버필드) + 기능(멤버메서드)
 *          -> 속성 : 멤버변수(멤버필드) - 클래스의 특징 - 명사
 *          -> 기능 : 멤버메서드 - 클래스의 행위 - 동사
 * 5. 클래스 구성 : 클래스 헤더, 멤버필드(변수, 상수) 
 *               멤버메서드, 생성자
 *    
 * [클래스 형식]
 *           [접근지정자] class 클래스이름 {
 *                     멤버변수(멥버필드);
 *                     생성자();
 *                     멤버메서드() {  }
 *           }
 *           
 * - 클래스이름 : 식별자(첫글자는 대문자로 시작)                    
 */

public class Ex01 {
	
	// 멤버필드는 초기값을 할당하지 않으면 JVM이
	// 해당 데이터 타입에 맞게 알아서 default 값을 할당해 준다.
	
	int num;         // 멤버변수(멤버필드)  - 전역변수
	String str;      // 벰버변수(멤버필드)  - 전역변수
	
	void display() {   // 멤버메서드
		int score = 10;    //지역변수
		System.out.println("멤버필드(전역변수) ==> " + num);
		System.out.println("멤버필드(전역변수) ==> " + str);
		System.out.println("지역변수 : " + score);
	}

	
	public static void main(String[] args) {
		
		// Ex01 클래스 객체 생성 방법
		// 1단계 : 클래스 선언
		// 형식) 클래스이름 참조변수(객체참조이름);
		//Ex01 ex;
		
		// 2단계 : 클래스 객체 생성
		// 형식) 참조변수 = new 생성자();
		//ex = new Ex01();

		// 1단계 + 2단계 : 클래스 선언 및 클래스 객체 생성
		Ex01 ex = new Ex01();
		
		// 3단계 : 참조변수를 이용하여 객체에 접근.
		// 객체에 접근 시 .(도트연산자)를 이용하여 접근.
		ex.display();
		
		System.out.println();
		
		ex.num = 50;
		ex.str = "홍길동";
		ex.display();
		System.out.println();
		
		Ex01 ex1= new Ex01();
		ex1.num = 100;
		ex1.str = "이순신";
		ex1.display();
		System.out.println();

		// 두 객체의 주소가 같은지 틀린지 확인하는 방법
		System.out.println("ex 주소 ==> " + ex);
		System.out.println("ex1 주소 ==> " + ex1);
	}

}
