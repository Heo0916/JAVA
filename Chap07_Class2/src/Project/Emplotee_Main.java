package Project;

import java.util.Scanner;

public class Emplotee_Main {

	public static void main(String[] args) {
		
		
		Scanner n = new Scanner(System.in);
		System.out.print("고용형태-정규직(P), 임시직(T)를 입력하세요 : ");
		String a1 = n.next();
		
		if(a1.equals("P"))
		{
			Permanet p = new Permanet();
			System.out.print("이름, 기본급, 보너스를 입력하세요:");
			
			p.setName(n.next());
			p.bonus = n.nextInt();
			p.pay = n.nextInt();
			
			System.out.println("정규직");
			System.out.println("이름 : " + p.getName());
			p.getPay();
			}
		
		else {
			Temporary t = new Temporary();
			
			System.out.print("이름, 기본급, 보너스를 입력하세요:");
			t.setName(n.next());
			t.pay = n.nextInt();
			t.time = n.nextInt();
			
			System.out.println("비정규직");
			System.out.println("이름 : " + t.getName());
			t.getPay();
		}

		n.close();
	}

}
