package Class;

public class Student_Main {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.display();
		System.out.println();
		st.hakbun = 2080001;
		st.name = "홍길동";
		st.major = "경제학과";
		st.age = 23;
		st.address = "서울시 마포구";
		st.display();
		System.out.println();

		Student st1 = new Student(201800002, "이순신", "해양", 23,"서울시 마포구");
		st1.display();
	}

}
