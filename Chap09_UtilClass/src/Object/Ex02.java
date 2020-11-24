package Object;

public class Ex02 {

	public static void main(String[] args) {

		Student st = new Student(2018001, "홍길동");
		Student st1 = new Student(2018001, "홍길동");

		System.out.println("st 객체 ==> " + st.toString());
		System.out.println("st1 객체 ==> " + st1.toString());
		
		if(st == st1) {
			System.out.println("참조주소가 같다");
			
		}else {
			System.out.println("참조주소가 다르다");
		}
		
		if(st.toString().equals(st1.toString())) {
			System.out.println("같다");
			
		}else {
			System.out.println("다르다");
		}
	}

}
