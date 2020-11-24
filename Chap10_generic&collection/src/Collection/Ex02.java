package Collection;

import java.util.HashSet;
import java.util.Set;

/*
 * 2. Set 계열 컬렉션 프레임워크 특징
 *    - 자료의 순서가 없다. ==> 정렬 기능 불가능.
 *    - 중복 데이터는 허용 불가.
 *    - Set 인터페이서의 자식클래스를 이용하여 구현
 *      -> HasjSet(O), TressSet(X)
 *      
 */

public class Ex02 {

	public static void main(String[] args) {
		
		// Set 인터페이스의 자식클래스로 객체 생성
		Set<Integer> set = new HashSet<Integer>();
		
		// 1. 원소 추가 : add(값)
		set.add(100);
		set.add(200);
		set.add(300);  // 중복발생
		set.add(400);	
		set.add(500);
		set.add(300);  // 중복발생
		
		// 2. 원소 크기 : size()
		System.out.println("set 크기 ==> " + set.size());
		
		// 3. 원소 출력
		for(Integer k : set) {
			System.out.println("set 요소 ==> " + k);
			
		}
		

		

	}

}
