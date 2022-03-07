package com.google.lecture.ch08;

public interface RemoteControl {

//	상수
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;		// public static final 생략 가능
	
//	추상 메서드	 : 선언만	, 구현 클래스에서 무조건 오버라이드 해야함			// public abstract 생략 가능
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	디폴트 메서드	//public 생략가능
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
//	정적 메서드 : 객체 생성 없이 사용 가능한 메서드	//public 생략가능
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
