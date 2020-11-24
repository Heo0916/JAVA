package Object;

/*
 * toString() 메서드 재정의
 * - Object 클래스에서 상속해 준 메서드 원형을
 *   유용한 정보가 리턴되도록 재정의한다.
 * - 클래스의 값을 가지고 있는데 값이 올바르게 담겼는지
 *   확인할 때 toStirng() 메서드를 오버라이드를 통해서 
 *   값을 뽑아 낼 수 있다.
 */
public class Student {
	
	int hakbun;          // 학생 학번
	String name;         // 학생 이름
	
	public Student() {	}
	
	public Student(int hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "학번 : " + hakbun + ", 이름 : " + name;
}
}
