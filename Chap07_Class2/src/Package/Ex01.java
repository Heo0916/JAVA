package Package;

import Model.MemberDTO;

/*
 * 패키지(Package)?
 * - 서로 연관성이 있는 클래스를 묶어 주는 역활(폴더와 유사)
 * - import 키워드 : 현재 클래스에서 외부의 다른 패키지에 있는
 *                 다른 클래스를 사용하기 위해서는 import 해야 한다.
 *                 (단, 동일한 패지키인 경우는 제외)
 *   형식) import 패키지명.클래스명;
 * - 자동 import 단축 키 : ctrl + Shift + O 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// MemberDTO 클래스를 사용하고 싶은 경우
		MemberDTO dto = new MemberDTO();
		
		// setter() 메서드를 이용하여 초기값을 할당.
		dto.setId("hong");
		dto.setPwd("12123123");
		dto.setName("홍길동");
		dto.setAge(27);
		dto.setAddress("서울시 마포구");
		
		System.out.println("아이디 : " + dto.getId());
		System.out.println("비밀번호 : " + dto.getPwd());
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAge());
		System.out.println("주소 : " + dto.getAddress() );
		

	}

}
