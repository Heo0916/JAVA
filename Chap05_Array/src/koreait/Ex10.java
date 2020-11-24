package koreait;

/*
 * java 의 다차원 배열은 행마다 서로 다른 열을 갖는다.
 * - 2차원 배열의 가변 배열(행마다 메모리 크기를 다르게 설정할 수 있음)
 * - 사용 이유 : 메모리 손실을 최소화 시켜 주기 위함. 
 */

public class Ex10 {

	public static void main(String[] args) {
		
		// 1. 다차원 배열의 가변배열 선언 및 메모리 할당.
		int [][] arr = new int [3][];  // 행:3행, 열:미정

		// 2. 행마다 열은 지정
		arr[0] = new int[3];           // 1행3열
		arr[1] = new int[1];           // 2행1열
		arr[2] = new int[5];           // 3행5열
		
		//3. 가변 배열에 초기값 할당.
		int cnt = 10;
		System.out.println(arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt += 10;
			}
		}
		// 4. 가변 배열을 출력해 보자.
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}
	
	}

}
