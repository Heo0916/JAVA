package Collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 프레임워크
 * - 컬렉션 사전적 의미 : 수집해서 저장한다는 의미.
 * 1. 데이터의 추가, 수정, 삭제, 검색 등을
 *    효과적으로 제공하는 자료구조 관련 클래스.
 * 2. 켈력선 프레임워크 
 *    1) 컬렉션 클래스를 표준화하여 설계해 놓은 인터페이스.
 *    2) List 계열, Set 계열 , Map 계열 
 */

/*
 * 1. List 계열의 컬렉션 프레임워크 특징
 *    - 자료의 순서가 보장(index) : 정렬 기능 제공.
 *    - 중복 데이터가 허용됨.
 *    - List 인터페이스의 자식 클래스로 구현
 *      => ArrayList(O), LinkedList(X), Vector(X)
 *    - 특히 DB에 저장된 데이터를 레코드 단위로
 *      저장하거나 가져올 경우 많이 사용됨.
 */

public class Ex01 {

	public static void main(String[] args) {
		// List 인터페이스 객체 생성
		List<String> list = new ArrayList<String>();
		
		// 1. 원소 추가 : add("값)
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("이순신");
		
		// 2. 원소의 크기를 반환(정수값으로 반환)  : size()
		//int size = list.size();
		System.out.println("list의 크기 ==> " + list.size());
		System.out.println();
		
		// 3. list 원소의 출력 방법(1번째) - get(index)
		for(int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "] = " + list.get(i));
			
		}
		System.out.println();
		
		
		// 3. list 원소의 출력 방법(2번째)
		for(String k  : list ) {
			System.out.println("list 원소 ==> " + k);
		}
		System.out.println();
		
		// 4. 모든 요소 제거 : clear()
		list.clear();
		System.out.println("list 원소 수 ==> " + list.size());
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("이순신");
		
		// 5. list의 특정 요소 제거 : remove(index)
		list.remove(1);
		for(int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "] = " + list.get(i));
			
		}
		System.out.println();
		
		// 6. list의 특정 index에 추가 : add(index, element)
		// 해당 인덱스에 추가가 되고, 이전에 있던 index는 
		// 한칸씩 뒤로 올라간다.
		list.add(1, "김유신");
		for(int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "] = " + list.get(i));
			
		}
		System.out.println();
		
		
	}

	
	
	
	
	
	
	
	
}
