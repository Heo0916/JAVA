package Class;

public class Member_main {

	public static void main(String[] args) {
		
		// Member 클래스 객체 생성
		Member st = new Member();
		st.name = "허동기";
		st.age = 23;
		st.display();
		System.out.println();
		
		Member st1 = new Member("허동", 28);
		st1.display();
		
		
		

	}

}
