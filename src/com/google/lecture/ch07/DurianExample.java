package com.google.lecture.ch07;

public class DurianExample {

	public static void main(String[] args) {

		Durian durian = new Durian();
		
//		메소드의 상속
		durian.printApple();
		durian.printBanana();
		durian.printCherry();
		durian.printDurian();
		
//		필드의 상속
		System.out.println(durian.getStrApple());
		System.out.println(durian.getStrBanana());
		System.out.println(durian.getStrCherry());
		System.out.println(durian.getStrDurian());
	}

}
