package com.google.lecture.ch04;

public class ifElseIfElseExample {

	public static void main(String[] args) {

		int score = 45;
		
		if(score >= 90) {
			System.out.println("점수가 100~90 사이입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 89~80 사이입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 79~70 사이입니다.");
			System.out.println("등급은 C입니다.");
		} else if(score >= 60) {
			System.out.println("점수가 69~60 사이입니다.");
			System.out.println("등급은 D입니다.");
		} else {
			System.out.println("점수가 59 이하입니다.");
			System.out.println("등급은 F입니다. 정신차리세요");
		}
		
		int a, b, c, e, f;
		
		a = 20;
		b = 20;
		
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}
