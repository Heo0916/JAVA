package Overriding;

public class Dog extends Animal {
	
	// 메서드 재정의
	
	/*void sund() {
		System.out.println("멍멍~~~");
	}
	*/
	
	@Override
	 void sound() {
		System.out.println("멍멍~~~");
	}
}
