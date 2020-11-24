package koreait;

import java.util.Scanner;

public class Ex07_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 입력 : ");
		
		int [] jumsu = new int[sc.nextInt()]; //점수 배열
		String[] subject = new String[jumsu.length]; // 과목명 배열
		int sum = 0; //총점 변수
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print("과목명을 입력하세요. : ");
			subject[i] = sc.next();
			System.out.print(subject[i] + "점수 입력 : ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i]; // sum = sum + jumsu[i];
		}
		
		float avg = sum / (float)jumsu.length;
		String grade;
		
		if(avg>=90) {
			grade = "A 학점";
			}else if(avg>=80) {
				grade = "B 학점";
			}else if(avg>=70) {
				grade = "C 학점";
			}else if(avg>=60) {
				grade = "D 학점";
			}else 
				grade = "F 학점";
			
	
	//성적 결과를 출력해 보자.
	for(int i=0; i<jumsu.length; i++) {
		System.out.println(subject[i]+"점수 : " + jumsu[i] + "점");
	}
	System.out.println("총  점 : " + sum + "점");
	System.out.printf("평  균 : %.2f점 \n", avg  );
	System.out.println("학  점 : " + grade);
	
	sc.close();
	}

}
