package com.google.lecture.ch06;

public class SixCarExample {

	static String name = "장원영";
	
	public static void main(String[] args) {

		name = "전지현";
		
		SixCar myCar = new SixCar("포르쉐");
		SixCar yourCar = new SixCar("벤츠");
		
		myCar.run();
		yourCar.run();
		
		print("안녕");
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
