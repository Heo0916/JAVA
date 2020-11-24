package Object;

/*
 * Object 클래스
 * 1. java의 모든 클래스의 조상 클래스이다.
 * 2. 사용자가 정의한 클래스에 자동으로 상속된다.
 *    -> 단, extends 키워드를 사용하지 않는 경우에만 상속됨.
 *    
 * [Object 클래스의 주요 메서드]
 * 1. toString() : 객체를 문자열로 반환.
 * 2. getClass() : 클래스의 정보를 반환.
 * 3. hashCode() : 객체의 해쉬코드 값을 반환.
 * 4. equals() : 객체의 값을 비교하여 결과(ture/false) 반환.
 * 5. clone() : 객체 복제 기능.     
 */

public class Ex01 {

	public static void main(String[] args) {
		
		Ex01 ex = new Ex01();
		Ex01 ex1 = new Ex01();
		
		// 1. toString() : 객체를 문자열로 반환
		// 형식) 패키지명. 클래스명@해쉬코드(16진수)
		System.out.println("ex.toString ==> " + ex.toString());
		System.out.println("ex1.toString ==> " + ex1.toString());
		
		// 2. getClass() : 객체에 대한 정보를 반환.
		// 형식) class 패키지명.클래스명;
		System.out.println("getClass() ==> " + ex.getClass());
		
		// 3. hashCode() : 객체의 해쉬코드 값을 반환.
		// 형식) 상수값
		System.out.println("ex.hashCode() ==> " + ex.hashCode());
		System.out.println("ex1.hashCode() ==> " + ex1.hashCode());
		
		




	}

}
