package koreait;

/*
 * [문제] 점수를 입력해서 해당 점수가 60점 이상이면 "합격",
 *       60점 미만이면 "불합격" 이라는 문자열을 화면에
 *       출력해보세요.
 */

public class Ex05 {

	public static void main(String[] args) {
		
		int num1 = 50;
		
		if(num1 >= 60) {
			System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
		System.out.println(); // 빈 줄 삽입
		
		int su = 17;
		
		if(su%2 == 1) {
			System.out.println(su + "는 홀수입니다.");
			}else {
				System.out.println(su + "는 짝수입니다.");
			}
	}

}