package Method;

public class Ex05_Main {

	public static void main(String[] args) {
		System.out.println("su ==> " + Ex05.num);
		Ex05.add(200, 100);
		
		// Ex05 클래스 사용하는 방법
		// 형식) 클래스이름 참조변수 = new 클래스이름(생성자)();

		Ex05 ex = new Ex05();
		System.out.println("su ==> " + ex.su); 
		ex.sum();
	
	}

}
