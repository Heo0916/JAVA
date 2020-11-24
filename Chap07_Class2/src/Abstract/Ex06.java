package Abstract;

public class Ex06 {

	public static void main(String[] args) {
		
		Ex03 ex = new Ex03();
		ex.prn();
		ex.prn2();
		ex.sum();      // 추상메서드 재정의
		ex.minus();    // 추상메서드 재정의
		System.out.println();

		
		Ex05 ex05 = new Ex05();
		ex05.sum();       // 추상메서드 재정의
		ex05.minus();     // 추상메서드 재정의
		ex05.mul();       // 추상메서드 재정의
	}

}
