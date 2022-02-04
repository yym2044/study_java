package com.google.lecture.ch02;

public class LongExample {

	public static void main(String[] args) {

		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000; 컴파일 에러
//		int 범위를 벗어나는 숫자에 long 타입을 붙이고 싶은 경우 숫자 뒤에 'L'을 붙여야한다
		long var4 = 1000000000000L;
				
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}

}
