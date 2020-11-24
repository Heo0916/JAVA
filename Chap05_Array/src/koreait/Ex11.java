package koreait;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력해 주세요 : ");
		
		int [] arr = new int[sc.nextInt()]; //배열의 크기
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1 + "배열의 정수를 입력해주세요 : " );
			arr[i] = sc.nextInt();
			}
		
		int max = arr[0] , min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]  );
			if(max<arr[i]){
				max = arr[i];
			}else if (arr[i]< min) {
				min = arr[i];
			}
		}
			System.out.println("최댓값 ==> " + max);
			System.out.println("최솟값 ==> " + min);
				
		sc.close();		
			}
		}

