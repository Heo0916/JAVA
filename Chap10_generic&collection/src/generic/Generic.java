package generic;

/*
 * 제네릭(Generic) - 포괄적인, 총괄적인
 * 1. 특정 클래스에 원하는 객체 타입을 지정하여
 *    지정된 객체만 저장하게 하는 문법.
 * 2. Java SE 5.0에서부터 추가된 기능.
 * 3. 데이터의 명확성과 안전성을 보장해 준다.
 *    => 다른 데이터 타입이 들어올 경우,
 *       컴파일 시점에서 error 발생.
 */
public class Generic<T> {
	
	T[] arr;
	T var;
	
	public void setArr(T[] arr) {
		this.arr = arr;
		
	}
	
	public void setVar(T var) {
		this.var = var;
	}
	public void display() {
		for(T k : arr) {
			System.out.println(k);
			
		}
		System.out.println("var ==> " + var);
	}
	
	

}
