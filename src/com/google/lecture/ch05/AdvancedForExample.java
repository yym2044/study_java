package com.google.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {

		int[] scores = {95,71,84,93,87,88,55};
		
		int a = 0;
		for(int score : scores) {
			System.out.println(a + ": score: " + score);
			a++;
		}
		
	}

}
