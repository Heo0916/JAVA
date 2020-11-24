package Abstract;

public class Ex01 {

	public static void main(String[] args) {
		
		//SuperA 클래스는 완성이 안 되었기 때문에
		//객체 생성이 안 된다.
		//SuperA sa = new SuperA();
		SubA sub = new SubA();
		sub.num = 100;
		sub.calc();
		System.out.println("num ==> " + sub.num);
		System.out.println("calc() 메서드 호출 ==> " + sub.calc());
		sub.display();

	}

}
