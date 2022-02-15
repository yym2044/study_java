package com.google.lecture.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

//		int[] score; //선언
//		
//		int score2[]; //선언
//		
//		int[] score3 = {1,2,3}; //객체 생성
//		
//		int score4[] = {4,5,6}; //객체 생성
		
		int[] score = {83,90,87,99};
		
		System.out.println("score[0] = " + score[0]);
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			sum += score[i];
		}
		System.out.println("총합은 : " + sum);
		double avg = (double) sum / 4;
		System.out.println("평균은 : " + avg);
	}

}
