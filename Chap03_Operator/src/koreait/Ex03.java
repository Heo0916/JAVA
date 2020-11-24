package koreait;

/*
 * 논리연산자
 * - 논리곱 : &&(AND)
 * - 논리합 : ||(OR)
 * - 부  정 : !(NOT)
 * - 논리연산은 우선적으로 관계연산이 수행된 후
 *   논리연산이 진행이 된다.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int age = 17; // 나이 변수
		
		String result = ((age >= 10) && (age <=19)) ? "청소년" : "미청소년";
		System.out.println("당신은 " + result + " 입니다.");

	}

}
