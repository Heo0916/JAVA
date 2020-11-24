package koreait;

/*
 *  배정연산자(=)
 *  형식) 변수 = 변수 or 상수 or 식;
 *  - 우변의 값이 좌변의 변수에 할당(저장).
 *  
 *  단축배정연산자
 *  -배정연산자를 간편하게 사용하는 연산자.
 */

public class Ex05 {
	
	public static void main(String[] args) {
		
		int a = 10, b = 3, result = 0;
		
		result = result + b; // result 변수는 누적변수
		
		result += b; 
		
		result -= b; // result = result -b;
		
		a *= b; // a = a * b;
		a /= b; // a = a / b;
		
		
	}

}
