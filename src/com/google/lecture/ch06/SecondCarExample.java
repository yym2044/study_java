package com.google.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {

		SecondCar secondCar = new SecondCar();
		
		System.out.println("secondCar.company = " + secondCar.company);
		System.out.println("secondCar.model = " + secondCar.model);
		System.out.println("secondCar.color = " + secondCar.color);
		System.out.println("secondCar.maxSpeed = " + secondCar.maxSpeed);
		
		System.out.println("------------------------------");
		
		SecondCar secondCar1 = new SecondCar("아반떼");
		
		System.out.println("secondCar1.company = " + secondCar1.company);
		System.out.println("secondCar1.model = " + secondCar1.model);
		System.out.println("secondCar1.color = " + secondCar1.color);
		System.out.println("secondCar1.maxSpeed = " + secondCar1.maxSpeed);
		
		System.out.println("------------------------------");
		
		SecondCar secondCar2 = new SecondCar("소나타","White");
		
		System.out.println("secondCar2.company = " + secondCar2.company);
		System.out.println("secondCar2.model = " + secondCar2.model);
		System.out.println("secondCar2.color = " + secondCar2.color);
		System.out.println("secondCar2.maxSpeed = " + secondCar2.maxSpeed);
		
		System.out.println("------------------------------");
		
		SecondCar secondCar3 = new SecondCar("그랜져","Black",200);
		
		System.out.println("secondCar3.company = " + secondCar3.company);
		System.out.println("secondCar3.model = " + secondCar3.model);
		System.out.println("secondCar3.color = " + secondCar3.color);
		System.out.println("secondCar3.maxSpeed = " + secondCar3.maxSpeed);
		
		System.out.println("------------------------------");
	}

}
