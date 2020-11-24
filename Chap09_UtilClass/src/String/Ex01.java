package String;

/*
 * String 클래스의 특징
 * 1. 문자열 객체를 생성하는 클래스.
 * 2. 객체 생성 방법(2가지)
 *    1) 리터럴 방식으로 객체 생성.
 *       예) String str1 = "홍길동";
 *          String str2 = "홍길동";
 *    2) new 키워드를 이용하여 객체 생성.
 *       예) String str3 = new String("홍길동");
 * 3. equals() : 객체의 내용(값)을 대상으로 비교하여
 *               같으면 true, 틀리면 false 값을 리턴.
 *               예) if(str1.equals(str2) {  }      
 */

public class Ex01 {

	public static void main(String[] args) {

		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(str1 == str2) {
			System.out.println("참조 주소가 같다.");
		}else {
			System.out.println("참조 주소가 다르다.");
		}
		
		System.out.println("str1 주소 ==> " + System.identityHashCode(str1));
		System.out.println("str2 주소 ==> " + System.identityHashCode(str2));
		System.out.println("str3 주소 ==> " + System.identityHashCode(str3));
		System.out.println("str4 주소 ==> " + System.identityHashCode(str4));

	

	}

}
