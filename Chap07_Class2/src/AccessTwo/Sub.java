package AccessTwo;

import AccessOne.Super;

public class Sub extends Super {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		
		// 해당 클래스내에서만 접근 가능 - private
		//System.out.println("num1 ==> " + sub.num1);

		// 동일한 패키지내에서만 접근 가능 - default 
		//System.out.println("num2 ==> " + sub.num2);
		
		// 상속관계인 경우 패키지가 다르더라도 접근이 가능하다 - protected
		System.out.println("num3 ==> " + sub.num3);
		
		// 모든 클래스에서 접근이 가능 - public
		System.out.println("num4 ==> " + sub.num4);
		
		
	}

}
