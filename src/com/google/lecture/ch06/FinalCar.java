package com.google.lecture.ch06;

public class FinalCar {

//	필드
	private int speed;
	private boolean stop;
	
//	생성자
	
//	메소드	getter, setter : 우클릭 -> source -> getter/setter 생성 가능
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
