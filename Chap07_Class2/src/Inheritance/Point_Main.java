package Inheritance;

public class Point_Main {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(5, 3, 2);	
		p3.display();
		System.out.println();
		
		Point3D p = new Point3D();
		p.x = 7;
		p.y = 1;
		p.z = 3;
		p.display();

	}

}
