package koreait;

public class Thread2 extends Thread{

	@Override
	public void run() {
		int j = 1;
		while(true) {
			System.out.println("j ==> " + j);
			j++;
		}
	}
}
