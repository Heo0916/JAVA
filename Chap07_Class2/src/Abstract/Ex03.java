package Abstract;

public class Ex03 extends Ex02{

	@Override
	void sum() {
		System.out.println("sum ==> " + (su1+su2));
		
	}

	@Override
	void minus() {
		System.out.println("minus ==> " + (su2-su1));
		
	}

}
