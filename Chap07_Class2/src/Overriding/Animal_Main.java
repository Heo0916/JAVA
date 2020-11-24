package Overriding;

public class Animal_Main {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.sound();
		System.out.println();
		
		Dog d = new Dog();
	
		d.sound();
		
		Chicken c = new Chicken();
		c.sound();
		
		Pig p = new Pig();
		p.sound();

	}

}
