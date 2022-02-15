package com.google.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;	// break과 달리 증감식으로 이동
			}
			System.out.println(i);
		}
		System.out.println();
	}

}
