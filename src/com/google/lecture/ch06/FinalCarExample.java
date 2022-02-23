package com.google.lecture.ch06;

public class FinalCarExample {

	public static void main(String[] args) {

		FinalCar car = new FinalCar();
		
//		잘못된 속도 변경
		car.setSpeed(-50);
		
		System.out.println("현재 속도 : " + car.getSpeed());
		
//		올바른 속도 변경
		car.setSpeed(60);
		
//		멈춤
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도 : " + car.getSpeed());
		
	}

}
