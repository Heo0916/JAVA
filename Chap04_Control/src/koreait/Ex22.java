package koreait;

/*
 * continue 명령어
 * - 반복문에서 사용할 수 있는 명령어.
 * - 반복문을 탈출하는 것이 아니라, 다음 회차를 반복하기 위해
 *   continue문 수행을 포기하고 증감식으로 간다.
 * - 즉, 현재 반복되고 있는 과정을 건너 뛴다. (skip)
 */

public class Ex22 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2 == 1) {
				continue;
			}
			
			sum += i;
		}
		System.out.println("sum ==> " + sum);
	}

}
