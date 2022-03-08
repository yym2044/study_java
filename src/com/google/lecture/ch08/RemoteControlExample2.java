package com.google.lecture.ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		
	//  익명구현객체
//		형식
//		인터페이스 변수 = new 인터페이스 {
//		추상메서드 선언
//		}
		
		RemoteControl rc = new RemoteControl() {	// 익명 구현 객체 	/ 객체 익명
			
			@Override
			public void turnOn() {
				System.out.println("asdfasd");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			
			
		};
		
		rc.turnOn();
	}
}
