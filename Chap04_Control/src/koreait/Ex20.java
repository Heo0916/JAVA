package koreait;

// 다중반복문을 이용하여 구구단을 만들어보자.

public class Ex20 {

	public static void main(String[] args) {
		
		//구구단을 세로로 출력
		for(int i=1; i<=9; i++) { // 구구단의 단
			System.out.println("***"+ i +"단 출력 ***");
			for(int a=1; a<=9; a++) { // 구구단의 수
				System.out.println(i + " * " + a+ " = " + (i*a));
			}
			System.out.println();
		}
		
		//구구단을 가로로 출력해 보자.
		for(int m=2; m<=9; m++) {
			System.out.print("***" + m + "단 ***\t");
		for(int k=1; k<=9; k++) { // 구구단의 수
			for(int j=2; j<=9; j++) { // 구구단의 단
				System.out.print(j + " * " + k + " = " + (j*k) + "\t");
			}
			System.out.println();	
		}
		
	}
		
	}
}

