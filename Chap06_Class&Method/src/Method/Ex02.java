package Method;

/*
 *  매개변수가 있는 메서드 정의
 *  형식) 
 *      [접근제한] 반환형 메서드이름(type 변수1, type 변수2) {
 *               메서드 실행문;
 *      }
 *      
 * - 리턴타임 : void
 *   ==> 결과값을 돌려줄 필요가 없는 경우 사용됨.     
 *   
 *   
 *   실인수와 가인수
 *   - 실인수(인자) : 매개변수에 전달할 실제 값 => 매서드 호출시 사용됨.
 *   - 가인수(매개변수) : 메서드에서 받은 값 => 메서드에 정의.
 *   - 실인수와 가인수는 반드시 type, 순서, 갯수가 일치해야 함.
 */


public class Ex02 {

	public static void method1(int su) {
		System.out.println("su ==> " + su);
	}
	
	public static void method2(int su1, int su2) {
		System.out.println("su1 ==> " + su1 + ", su2 ==> " + su2);
	}
	public static void add(int su1, int su2) {
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2) );
	}
	public static void sub(int su1, int su2) {
		System.out.println(su1 + " - " + su2 + " = " + (su1-su2) );
	}
	
	
	
	public static void main(String[] args) {
		 
		System.out.println("프로그램 시작");
		
		method1(98);
		method2(150, 27);
		add(130, 20);
		sub(130, 20);
		
		
		System.out.println("프로그램 종료");

	}

}
