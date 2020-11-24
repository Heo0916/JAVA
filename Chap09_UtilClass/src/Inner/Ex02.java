package Inner;

public class Ex02 {

	public static void main(String[] args) {

		// 중첩클래스의 객체 생성 방법
		// 먼저는 외부(outer) 클래스 객체 생성
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.prn();
	}

}
