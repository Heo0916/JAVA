package Abstract;

public abstract class Ex02 {      // 추상클래스
	
	int su1 = 100;
	static int su2 = 200;
	static final float PI = 3.14f;
	int su4 = 20;
	
	void prn() {
		System.out.println("su1 ==> " + su1);
	}
	
	void prn2() {
		System.out.println("su2 ==> " + su2);
	}
	
	// 굳이 추상메서드를 만드는 이유
	// 어차피 메서드 재정의를 한다면 굳이 { } 에 내용을 쓸필요가 없다.
	abstract void sum();          // 추상메서드
	abstract void minus();        // 추상메서드

}
