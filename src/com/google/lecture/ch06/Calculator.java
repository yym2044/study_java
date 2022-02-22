package com.google.lecture.ch06;

public class Calculator {

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus(int a, int b) {
		return a + b;
	}
	
	public double divide(byte x, byte y) {
		return (double)x/y;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
