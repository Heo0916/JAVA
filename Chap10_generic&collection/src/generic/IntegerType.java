package generic;

public class IntegerType {

	Integer[] str;   // Integer 타입의 배열 선언
	Integer var;     // Integer 타입의 문자열 멤버변수 선언
	
	public void setArr(Integer[] str) {  // 배열 초기화 메서드
		this.str = str;
	}
	
	public void setVar(Integer var) {    // 멤버변수 초기화 메서드
		this.var = var;
	}
	public void display() {
		for(Integer k : str) {
			System.out.println(k);
		}
		
		System.out.println("var ==> " + var);
	
	}
}
