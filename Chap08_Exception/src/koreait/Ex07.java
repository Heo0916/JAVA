package koreait;

/*
 *  throws 키워드
 *  - 예외처리를 위임시키는 명령어.
 *    형식) 메서드명 throws 에외처리클래스 {   }
 *  - throws 지정된 메서드를 호출할 경우
 *    메서드 내에서 예외가 발생되면 해당 에외를
 *    메서드를 호출한 곳으로 위임시켜서 예외를 처리하는 방법. 
 */
public class Ex07 {
	
	void exception1() throws Exception {
		String str = null;
			System.out.println("문자열의 길이 : " + str.length());
	}
	
	void exception2() throws Exception {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		result = num1/num2;
				
		
		System.out.println("result ==> " + result);
	}

	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		try {
			ex.exception1();
			ex.exception2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
