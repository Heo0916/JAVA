package koreait;

/*
 *  배열(Array)?
 *  - 하나의 이름으로 동일한 자료형과 크기가 같은 데이터를
 *    여러 개 저장할 수 있는 메모리 공간을 확보하는 것을 말함.
 *  - 변수는 하나의 값 만을 저장하지만, 배열은
 *    다수의 값을 저장할 수 있음.
 *    
 * [배열 사용 절차]
 * 1단계 : 배열 선언(자료형[] 배열명)
 * 2단계 : 배열 객체 생성(메모리 할당 - new 키워드 사용)
 * 3단계 : 배열 초기화(할당된 영역에 값을 저장)
 * 4단계 : 배열 이용(데이터 처리(연산, 출력 등))
 * 
 * [배열 객체 생성 방법]
 * 1. new 키워드를 이용하여 생성.
 * 2. 배열의 초기값을 이용하여 생성.
 */

public class Ex01 {

	public static void main(String[] args) {
		
		// 1단계 : 배열 선언
		// 형식) 자료형[] 배열명;
		//int[] arr;
		
		// 2단계 : 배열 메모리 공간 확보
		// 형식) 배열명 = new 자료형[배열의 크기];
		// arr = new int[5];
		
		// 1단계 + 2단계 : 배열 선언 및 배열 메모리 공간 확보
		int[] arr = new int[5];
		
		// 3단계 : 배열 초기화(할당된 영역에 값을 저장)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;  //arr[2] = 130;
		arr[3] = 40;  //arr[3] = 90;
		arr[4] = 50;  //arr[4] = 30;
		
		// 4단계 : 배열 이용(데이터 처리(연산, 출력))
		arr[2] += 100; // arr[2] = arr[2] + 100;
		arr[3] += 50;  // arr[3] = arr[3] + 50;
		arr[4] -= 20;  // arr[4] = arr[4] - 20;
		
		// 배열을 출력해보자.
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		System.out.println("arr[4] = " + arr[4]);
		
		System.out.println();
		//반복문을 이용하여 배열을 처리한다.
		for(int i=0; i<5; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		

		
		
	}

}
