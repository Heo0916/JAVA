package koreait;

/*
 * 다차원 배열
 * - 1차원 배열이 여러 개 묶여 있는 형태의 배열을 말함.
 * - 다차원 배열은 행과 열의 개념이 적용됨.
 */

public class Ex09_1 {

	public static void main(String[] args) {
		// 다차원배열 선언 방법
		// 형식) 자료형[][] 배열명 = new 자료형 [행의 크기][열의 크기];
		int [][] arr = new int [3][2];
		
		// 배열의 초기화 작업
		int cnt = 10;
		for(int i = 0; i<3; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = cnt ;
				cnt += 10;
			}
		}
		
		// 다차원 배열에 저장된 내용을 출력해 보자.
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print("arr["+i+"]["+j+"] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
