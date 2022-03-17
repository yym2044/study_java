package test;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
