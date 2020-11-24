package koreait;

public class Ex06 {

	void exception1() {
		
		try {
			String str = null;
			System.out.println("문자열의 길이 : " + str.length());
		}catch(Exception e) {
			e.printStackTrace();
			/*
			 * printStactTrace()
			 * - 에러 메세지의 발생 근원을 찾아서
			 *   단계별로 에러를 출력한다.
			 */
		}
		
	}
	
	void exception2() {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
		 result = num1/num2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("result ==> " + result);
	}
	
	public static void main(String[] args) {
		
		Ex06 ne = new Ex06();
		
		ne.exception1();
		ne.exception2();

	}

}
