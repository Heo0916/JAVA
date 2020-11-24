package Interface;

public class Audio implements RemoteControl{

	int volume;    // 멤버변수
	
	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다.~~~");
		
	}

	@Override
	public void turnOff() {
	   System.out.println("Audio를 끕니다.~~~");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume> RemoteControl.max_volum) {
			this.volume = RemoteControl.max_volum;
		}else if(volume < RemoteControl.min_volum) {
			this.volume = RemoteControl.min_volum;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 Tv 볼륨 ==> " + this.volume);
		
	}
		
	}


