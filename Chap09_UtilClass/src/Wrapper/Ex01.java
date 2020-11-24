package Wrapper;

/*
 * Wrapper Class
 * - 기본자료형을 클래스 타입으로 포장해 놓은 클래스.
 * - 기본 타입의 값을 내부에 두고 포장하기 때문에 포장(wrapper) 객체라고 함.
 * - 기본자료형 : int, long, float, double, boolean, char
 * - wrapper class : Interger, Long, Float
 *                   Boolean, Character
 * - 사용 이유
 *   1. 매개변수로 객체가 요구될 때
 *   2. 기본형 값이 아닌 객체로 저장해야 될 때
 *   3. 객체간 비교가 필요할 때
 */

public class Ex01 {

	public static void main(String[] args) {

		Integer in = new Integer(200);
		Integer in1 = new Integer(100);
		
		System.out.println("sum ==> " + (in+in1));
		
		System.out.println("int 형 ==> " + in.intValue());
		System.out.println("float 형 ==> " + in.floatValue());
		
		// 숫자 -> 문자열 : toString()
		String res = in.toString();
		System.out.println(res + 40);
		
		// 문자열 -> 숫자 : parseInt()
		int num = Integer.parseInt(res);
		System.out.println(num + 40);
		
	}

}
