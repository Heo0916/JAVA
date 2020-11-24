package Method;

import java.util.Scanner;

public class Ex03 {

	public static void add(int su1, int su2) {
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
	}
	public static void sub(int su1, int su2) {
		System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
	}
	public static void gop(int su1, int su2) {
		System.out.println(su1 + " * " + su2 + " = " + (su1 * su2));
	}
	public static void di(int su1, int su2) {
		System.out.println(su1 + " / " + su2 + " = " + (su1 / su2));
	}
	public static void id(int su1, int su2) {
		System.out.println(su1 + " % " + su2 + " = " + (su1 % su2));
	}
		
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		
		add(num1, num2);
		sub(num1, num2);
		gop(num1, num2);
		di(num1, num2);
		id(num1, num2);
		
		sc.close();
		

	}

}
