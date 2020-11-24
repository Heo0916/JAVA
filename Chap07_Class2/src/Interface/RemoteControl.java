package Interface;

public interface RemoteControl {

	// 멤버필드 
	int max_volum = 10;
	int min_volum = 1;
	
	// 모든 메서드가 추상메서드
	void trunOn();
	void turnOff();
	void setVolume(int volume);
}
