package koreait;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 최대 개수를 입력하세요. : ");
		int star = sc.nextInt();
		
		for(int i = 1; i <= star*2-1; i++) {
			int line;
			// 입력받은 숫자만큼의 라인에 도달했으면 별 갯수를 줄여야 함.
			line = (i <= star) ? i : star*2-i;
			
			for(int j=1; j<=line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
