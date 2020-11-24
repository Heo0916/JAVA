package koreait;

import java.util.Scanner;

/*
 *  [문제] 키보드로 배열의 크기를 입력받아서 
 *        성적을 입력 후 성적의 총점, 평균,
 *        학점을 화면에 출력해 보세요.
 */

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 성적을 입력해 주세요 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
		}
	
		int avg = sum /arr.length;
		
		String gra;
		if(avg>=90) {
			 gra = "A 학점";
		}else if(avg>=80) {
			 gra = "B 학점";
			}else if(avg>=70) {
			 gra = "C 학점";
				}else if(avg>=60) {
			 gra = "D 학점";
					}else {
			 gra = "F학점";
					}
		
		System.out.println("성적의 총점 ==> " + sum);
		System.out.println("평균 ==> " + avg);
		System.out.println("학점 ==> " + gra);
		
		sc.close();
	
		

	}

}
