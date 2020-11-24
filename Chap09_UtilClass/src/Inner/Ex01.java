package Inner;

public class Ex01 {

	public static void main(String[] args) {

		// 무명 클래스로 객체 생성 방법
		Inter in = new Inter() {
			
			@Override
			public int sum(int n1, int n2) {
				
				return n1+n2;
			}
			
			@Override
			public int minus(int n1, int n2) {
				
				return n1 - n2;
			}
		};
		System.out.println("sum ==> " + in.sum(200, 50));
		System.out.println("minus ==> " + in.minus(140, 26));
	}

}
