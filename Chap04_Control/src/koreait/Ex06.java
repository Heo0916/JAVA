package koreait;

/*
 *  다중 if~else문
 *  형식)
 *      if(조건식1){
 *         조건식1이 참인 경우 실행문;
 *      }else if(조건식2) {
 *               조건식1이 거짓이고, 조건식2가 참인 경우 실행문;
 *      }else if(조건식3) {
 *               조건식1, 조건식가 거짓이고, 조건식3이 참인 경우 실행문;
 *      }else {
 *               조건식1, 조건식2, 조건식3이 모두 거짓인 경우 실행문;
 *      }               
 */

public class Ex06 {

	public static void main(String[] args) {
		
		int jumsu = 76;
		
		if(jumsu >= 90) {
			System.out.println(jumsu + "는 90 이상 숫자입니다.");
		}else if(jumsu >= 80) {
			System.out.println(jumsu + "는 80 이상 숫자입니다.");
		}else if(jumsu >= 70 ) {
			System.out.println(jumsu + "는 70점 이상 숫자입니다.");
		}else if(jumsu >= 60 ) {
			System.out.println(jumsu + "는 60 이상 숫자입니다.");
		}else {
			System.out.println(jumsu + "는 60 미만 숫자입니다.");
		}

	}

}
