package com.google.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {

		ThirdCar tc1 = new ThirdCar();
		
		System.out.println(tc1.company);
		System.out.println(tc1.model);
		System.out.println(tc1.color);
		System.out.println(tc1.maxSpeed);
		
		System.out.println("---------------------------");
		
		ThirdCar tc2 = new ThirdCar("비엠더블유");
		
		System.out.println(tc2.company);
		System.out.println(tc2.model);
		System.out.println(tc2.color);
		System.out.println(tc2.maxSpeed);
		
		System.out.println("---------------------------");
		
	}

}
