package Class;

/*
 * [문제] 이름과 나이를 멤버변수로 가지는
 *       Member라는 클래스를 만들고 해당 클래스에
 *       생성자를 이용하여 초기값을 할당, display()라는
 *       메서드를 만들어 출력하는 프로그램을 만들어 보세요.
 *       조건1) 기본생성자로 객체 생성 후 초기값 할당 후 출력.
 *       조건2) 멤버필드를 매개변수로 하여 초기값 할당 후 출력
 */
public class Member {
	
	// 멤버변수
	String name;
	int age;
	
	public Member() { }   // 기본생성자
		
	public Member(String a1, int a2) {              //생성자 오버로딩
		name = a1;
		age = a2;
	}
	
	void display() {
		System.out.println("이름 ==> " + name);
		System.out.println("나이 ==> " + age);
	}
	
	

}
