package Class;

/*
 * 캡슐화(Encapsulation)?
 * - 정보 은닉 : 클래스의 멤버 접근 제어 기법. 
 * - private : 외부에서 직접 접근 차단.
 * - public : 모든 클래스에서 접근 가능.
 * - setter() / getter() 메서드
 *   -> setter() : 지정자 메서드
 *   -> getter() : 획득자 메서드
 */

public class Number {

	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
	/*
	 * this : 멤버 자기 자신을 말한다.
	 * - 매개변수(지역변수)와 멤버변수(전역변수)의 이름이 같을 때 
	 *   멤버변수(전역변수) 앞에 this를 붙인다.
	 * - 지역변수와 전역변수의 이름이 같은 경우 우선 순위는 
	 *   지역변수가 높다.   
	 */
	
	
	
	/*
	 * setter() 메서드로 초기값 할당
	 * - private 멤버필드에 값을 지정(할당)하는 역할.
	 *   형식)
	 *         public void set멤버필드명(자료형 매개변수){
	 *           멤버필드 = 매개변수;
	 *         }
	 *         
	 * getter() 메서드로 할당된 값 가져오기
	 * - private 멤버필드에 할당된 값을 가져오는 역할.
	 *   형식)
	 *         public 반환형 get멤버필드명() {
	 *            return 멤버필드명;
	 *          }
	 *          
	 */           
	
	
	/*public void setNum1(int n1) {
		num1 = n1;
	}
	public void setNum2(int n2) {
		num2 = n2;
	}
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}*/
	
	
	
	
	
}
