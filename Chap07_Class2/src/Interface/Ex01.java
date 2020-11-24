package Interface;

public class Ex01 {

	public static void main(String[] args) {
	
		// 인터페이스는 객체 생성이 불가능.
		System.out.println("num ==> " + Sub.num);
		
		// Sub 클래스 객체 생성
		Sub sub = new Sub();
		// Sub.num = 100;  // 상수로 인식하기 때문에 값이 변경이 안됨.
		sub.display();
		sub.display2();
		
	}
}
