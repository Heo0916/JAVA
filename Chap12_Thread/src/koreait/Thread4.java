package koreait;

public class Thread4 implements Runnable{

	@Override
	public void run() {        // 1-2)
		int j = 1;
		while(true) {
			System.out.println("j ==> " + j);
			j++;
		}
		
	}
		
	

}
