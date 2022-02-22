package com.google.lecture.ch06;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int result1 = calculator.plus(7, 8);
		System.out.println("result1 : " + result1);
		
		byte x = 15;
		byte y = 7;
		double result2 = calculator.divide(x, y);
		System.out.println("result2 : " + result2);
		
		calculator.powerOff();
	}
 
}
