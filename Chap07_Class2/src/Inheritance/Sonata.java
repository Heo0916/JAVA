package Inheritance;

public class Sonata extends Car{
	
	// int cc;
	// int door; 상속으로 인해서 생략됨
	
	String model;        // 모델명
	
	void display() {
		System.out.println("모델명 : " + model);
		System.out.println("배기량 : " + cc);
		System.out.println("문짝 수 : " + door);
	}

}
