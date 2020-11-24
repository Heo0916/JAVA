package Inheritance;

public class Car_Main {

	public static void main(String[] args) {

		// Sonata 클래스 객체 생성
		// Sonata 클래스 객체 생성 시 JVM이
		// 우선적으로 Car 부모클래스를 객체 생성 후
		// 자식클래스인 Sonata 클래스 객체를 생성.
		Sonata s= new Sonata();
		s.model = "소나타";
		s.cc = 2000;
		s.door = 4;
		s.display();

	}

}
