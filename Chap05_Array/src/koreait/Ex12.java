package koreait;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i = 0; i<5; i++) {
			System.out.print(i+1 + "번째 정수를 입력해 주세요 : ");
			arr[i] = sc.nextInt();
		}
		int change = 0;
		
		for(int j = 0; j<5; j++) {
		for(int i = j; i<5; i++) {
			if(arr[j]<arr[i]){
			change = arr[i];
			arr[i] = arr[j];
			arr[j] = change;
			}
			}
		}
		

		for(int i = 0; i<5; i++) {
			System.out.print(arr[i] + "\t");
		}
		sc.close();
		}
}
	
		
	


	

