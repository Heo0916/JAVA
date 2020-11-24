package Inner;

/*
 * 중첩 클래스(Inner class)
 * 1. 클래스 내부에 또 다른 클래스를 정의.
 * 2. 내부클래스를 하나의 멤버로 사용하기 위함.
 * 3. 클래스 멤버 : 멤버변수, 멤버메서드,
 *               외부클래스, 내부클래스 참조변수 =
 *                                    외부클래스참조변수.new 내부클래스();
 */
public class Outer {
	
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner { // 내부(inner) 클래스
		
		public void prn() {
			System.out.println("a ==> " + a);
			System.out.println("b ==> " + b);
			System.out.println("c ==> " + c);

			
			
		}
	}
	

}
