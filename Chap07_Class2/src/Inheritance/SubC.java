package Inheritance;

public class SubC extends SuperC implements Inter02, Inter03 {

	@Override
	public void display5() {
		System.out.println("display5() 메서드 재정의");
	}

	@Override
	public void display3() {
		System.out.println("display3() 메서드 재정의");
		
	}

	@Override
	public void display4() {
		System.out.println("display4() 메서드 재정의");
		
	}

	@Override
	void display2() {
		System.out.println("display2() 메서드 재정의");
		
	}

}
