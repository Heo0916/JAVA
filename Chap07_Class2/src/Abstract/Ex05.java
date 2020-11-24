package Abstract;

public class Ex05 extends Ex04{

	@Override
	void mul() {
		System.out.println("mul ==> " + (su1*su4));	
	}

	@Override
	void sum() {
		System.out.println("sum ==> " + (su1 + su2));
	}

	@Override
	void minus() {
		System.out.println("minus ==> " + (su2-su4));
	}

}
