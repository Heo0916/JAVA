package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *  3. Map 계열의 컬렉션 프레임워크 특징
 *     - key와 value를 한 쌍으로 데이터를 저장하고,
 *       검색하는 기능을 제공.
 *     - key는 중복 불가, value는 중복 가능.
 *     - Map 인터페이스의 자식클래스로 구현.
 *     -> HashMap(선호), HashTable(ㅇ), TreeMap(x)
 */

public class Ex03 {

	public static void main(String[] args) {
		
		// Map 인터페이스의 자식클래스로 객체 생성.
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		
		// 1. 데이터를 저장 : put(key, value)
		// 이름을 키로 저장, 점수를 값(value)로 저장
		map.put("홍길동", 95);
		map.put("이순신", 88);
		map.put("유관순", 100);
		
		// 2. 키를 이용해서 데이터를 검색 - get(key)
		int score = map.get("이순신");
		System.out.println("이순신 점수 ==> " + score );
		System.out.println();
		
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		
		if(map.containsKey(name)) {
			System.out.println(name+ "님의 정수는 ==> " + map.get(name) + "점 입니다.");
		}else {
			System.out.println("검색한 이름이 없습니다.");
		}
		

		sc.close();
	}

	
	
	
	
}
