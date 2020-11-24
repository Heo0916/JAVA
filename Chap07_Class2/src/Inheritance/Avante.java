package Inheritance;

/*
 * super 키워드 
 * - 부모의 멤버를 호출하는 명령어.
 *   형식) super.부모클래스 멤버(멤버변수, 멤버메서드)
 * this 키워드
 * - 자식의 멤버를 호출하는 명령어.
 *   형식) this.현재클래스 멤버(멤버변수, 멤버메서드)
 */
public class Avante extends Car2{
	
	String color = "흰색";
	
	void dispaly() {
		System.out.println("엔진 : " + cc + ",문짝 수 :" + door +" 색상 :" + color);
		System.out.println("엔진 : " + cc + ",문짝 수 :" + door +" 색상 :" + super.color);
		System.out.println("엔진 : " + cc + ",문짝 수 :" + door +" 색상 :" + this.color);
		
	}

}
