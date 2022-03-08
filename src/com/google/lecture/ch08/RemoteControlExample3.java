package com.google.lecture.ch08;

public class RemoteControlExample3 {
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new SmartTelevision();
		Searchable searchable = new SmartTelevision();
		
		remoteControl.turnOff();
		remoteControl.turnOn();
//		remoteControl.search();	// error
		remoteControl.setVolume(15);
		remoteControl.setMute(false);
		
//		searchable.turnOff();	// error
//		searchable.turnOn();	// error
		searchable.search("아이즈원 장원영");
		
	}
}
