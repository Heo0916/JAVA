package Class;

import java.util.Scanner;

public class Drink_Main {

	public static void main(String[] args) {
		
		// 음료 자판기
		// 음료 종류 : 4가지
		// 음료 객체를 저장할 배열 만들기
		Drink[] arr = new Drink[4];
		Scanner sc = new Scanner(System.in);
		
		// Drink 객체 생성
		Drink d1 = new Drink("콜라", 500);
		Drink d2 = new Drink("사이다", 500 );
		Drink d3 = new Drink("레몬에이드", 800);
		Drink d4 = new Drink("포카리스웨트", 1000);
		
		// 각각의 객체를 배열에 넣어 보자.
		arr[0] = d1; arr[1] = d2;
		arr[2] = d3; arr[3] = d4;
		
		System.out.print("돈을 넣어주세요. : ");
		int coin = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(coin >= arr[i].price) {
				System.out.print(arr[i].name + "\t");
			}
		}
		System.out.println();
		
		sc.close();

	}

}
