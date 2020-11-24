package Package;

import java.util.Scanner;

import Model.MemberDTO;

/*
 * [문제] MemberDTO 클래스를 임포드하여 객체 생성 후
 *       MemberDTO 클래스의 각 멤버에 키보드로
 *       데이터를 입력 후 입력한 각 멤버의 내용을 
 *       화면에 보여주세요.
 */
public class Ex02 {

	public static void main(String[] args) {

		MemberDTO me = new MemberDTO();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요");
		me.setName(sc.next());
		System.out.print("아이디를 입력해주세요");
		me.setId(sc.next());
		System.out.print("비밀번호 입력해주세요");
		me.setPwd(sc.next());
		System.out.print("나이 입력해주세요");
		me.setAge(sc.nextInt());
		System.out.print("주소을 입력해주세요");
		me.setAddress(sc.next());
		
		System.out.println("이름 : " + me.getName());
		System.out.println("아이디 : " + me.getId());
		System.out.println("비번 : " + me.getPwd());
		System.out.println("나이 : " + me.getAddress());
		System.out.println("주소 : " + me.getAddress());
		
		sc.close();
	}

}
