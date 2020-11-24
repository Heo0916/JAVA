package Class;

/*
 * 클래스 (Class)와 객체(Object)
 * - 클래스 : 객체를 정의해 놓은 것(설계도 - 추상화)
 * - 객체 : 클래스에 의해서 만들어진 결과물(실제화)
 *   예) 제품 설계도(클래스) ==> 제품(객체)
 * - 인스턴스화 : 클래스를 이용하여 객체를 생성하는 과정.
 *   클래스(1) : 객체(n) 
 */

public class TV {

	// 클래스의 특징 - 멤버변수(멤버필드) - 명사
	String color;       // TV 색상
	boolean power;      // TV 전원
	int channel;        // TV 채널
	
	
	// 클래스의 행위 - 멤버메서드 - 동사
	void power() {   //전원 메서드
		power =  !power;
		}
	
	void channelUp() {  //  채널을 올리는 메서드
 		if(power) {
 			channel++;   // 채널 증가
 			}
	}
	
	void channelDown() {   // 채널을 내리는 메서드
		if(power) {
			channel--;   // 채널 감소
		}
	}
	
	void display() {   // TV 상태 보여주는 메서드
  		String status = "";
  		if(power) {
  			status = "전원 on";
  		}else {
  			status = "전원 off";
  		}
  		
  		System.out.println("TV 색상 ==> " + color);
  		System.out.println("TV 전원 ==> " + status);
  		System.out.println("TV 채널 ==> " + channel);
  		
	}
	
	
	
	
}
