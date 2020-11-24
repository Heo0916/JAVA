package Inheritance;

/*
 *  1. Super() 키워드 
 *     - 자식클래스에서 부모클래스의 생성자를 호출하는 명령어.
 *       형식) super(실인수);
 *  2. this() 키워드
 *     - 현재 클래스 내에서 다른 생성자를 호출하는 명령어.
 *       형식) this(실인수);
 *     주의) 생성자 첫 문장에 와야 한다.  
 */

public class Point3D extends Point{

	int z;         // 자식 멤버
	
	public Point3D() {
		super();
	}
	
	public Point3D(int x, int y) {
		//this.x = x;
		//this.y = y;
		super(x, y);
	}
	
	public Point3D(int x, int y, int z) {
		//this.x = x;
		//this.y = y;
		this(x, y);      
		this.z = z;
		}
	
	void display() {
		System.out.println("x 좌표 ==> " + x);
		System.out.println("y 좌표 ==> " + y);
		System.out.println("z 좌표 ==> " + z);
	}
	
}
