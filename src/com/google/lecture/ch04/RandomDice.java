package com.google.lecture.ch04;

public class RandomDice {

	public static void main(String[] args) {

		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);
		
		System.out.println("첫번째 주사위는 " + dice1 + "번 입니다.");
		System.out.println("두번째 주사위는 " + dice2 + "번 입니다.");
		System.out.println("두수의 합은 " + (dice1 + dice2) + "입니다.");
		
	}

}
