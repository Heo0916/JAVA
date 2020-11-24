package Interface;


public class Remote_Main {

	public static void main(String[] args) {
		
		// 다형성
		RemoteControl rc1 = new TV();
		RemoteControl rc2 = new Audio();
		
		rc1.trunOn();
		rc1.setVolume(13);
		rc1.turnOff();
		System.out.println();
		
		rc2.trunOn();
		rc2.setVolume(7);
		rc2.turnOff();
		System.out.println();
		

	}

}
