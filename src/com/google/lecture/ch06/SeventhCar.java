//객체 생성 없이 field, method 사용 가능
//field, method 앞에 붙여 사용 가능
//static 안에서 사용되어야 하는 필드 함수도 static 선언해야한다.

package com.google.lecture.ch06;

public class SeventhCar {

	int speed = 0;
	
	void run() {
		System.out.println(speed + "km/h로 달립니다.");
	}
	
	public static void main(String[] args) {
		
		SeventhCar seventhCar = new SeventhCar();
		
		seventhCar.speed = 10;
		seventhCar.run();
		
	}
	
}
