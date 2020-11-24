package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 키보드로 3명의 회원정보를
// 입력받아서 리스트에 저장해 보자.
public class Member_Main {

	public static void main(String[] args) {
		
		MemberDTO dto;
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 3명의 회원정보를 입력을 받자.
		for(int i = 0; i<3; i++) {
			dto = new MemberDTO();
			System.out.print((i+1) + "번째 아이디 입력 : " );
			dto.setId(sc.next());
			
			System.out.print((i+1) + "번째 비밀번호 입력 : " );
			dto.setPwd(sc.next());
			
			System.out.print((i+1) + "번째 이름 입력 : " );
			dto.setName(sc.next());
			
			System.out.print((i+1) + "번째 나이 입력 : " );
			dto.setAge(sc.nextInt());
			
			list.add(dto);
			
			
		}
		System.out.println("아이디 \t 비밀번호 \t 이  름\t나  이");
		System.out.println("============================");
		
		for(int i = 0; i<list.size(); i++) {
			dto = list.get(i);
			System.out.println
			(dto.getId()+"\t" + dto.getPwd() + "\t" + dto.getName() + "\t" + dto.getAge());
		}
		sc.close();
	}

}
