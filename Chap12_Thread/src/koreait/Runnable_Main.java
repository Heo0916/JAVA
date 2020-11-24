package koreait;

public class Runnable_Main {

	public static void main(String[] args) {
		
		// 2-3)
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		// 2-4)
		Thread th1 = new Thread(t3);
		Thread th2 = new Thread(t4);
		
		// 2-5)
		th1.start(); th2.start();

	}

}
