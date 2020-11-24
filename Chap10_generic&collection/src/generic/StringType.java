package generic;

public class StringType { // 모든 타입이 String

	String[] str;   // String 타입의 배열 선언
	String var;     // String 타입의 문자열 멤버변수 선언
	
	public void setArr(String[] str) {  // 배열 초기화 메서드
		this.str = str;
	}
	
	public void setVar(String var) {    // 멤버변수 초기화 메서드
		this.var = var;
	}
	public void display() {
		for(String k : str) {
			System.out.println(k);
		}
		
		System.out.println("var ==> " + var);
	
	}
}
