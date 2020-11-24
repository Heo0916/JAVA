package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ex04 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		String[] name = new String[sc.nextInt()];
		Integer[] score = new Integer[name.length];
		
		// 이름과 점수를 키보드로 입력을 받자.
		for(int i = 0 ; i< name.length; i++) {
			System.out.print((i+1) + "번째 이름 입력 : ");
			name[i] = sc.next();
			
			System.out.print((i+1) + "번째 점수입력 : ");
			score[i] = sc.nextInt();
			
			map.put(name[i], score[i]);
			
		}
		for(int i = 0 ; i< name.length; i++) {
			System.out.println(name[i] + "님의 점수는 " + score[i]);
		}
		
		System.out.print("검색할 이름을 입력해주세요");
		String name1 = sc.next();
		
		if(map.containsKey(name1)) {
			System.out.println( name1 + "님의 점수는 " + map.get(name1));
		}else {
			System.out.println("검색한 이름 없어");
		}
		sc.close();
		
	
		
		
		
		
		
	}

}
















