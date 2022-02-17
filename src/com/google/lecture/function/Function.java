package com.google.lecture.function;

public class Function {

	public static void main(String[] args) {

//		public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//			...
//			return 리턴값; // 리턴자료형이 void인 경우에는 return문이 필요없다.
//		}
		
		System.out.println(plus(1,2));
		System.out.println(minus(4,4));
		System.out.println(multi(4,5));
		System.out.println(div(4,3));
		
		System.out.println();
		
		all(1,2);
		System.out.println();
		
		System.out.println(arithmeticOperation(1,2,3));
		
		System.out.println(arithmeticOperation2(1,2)[3]);
	}

	public static int plus(int a, int b) {
		int value;
		value = a + b;
		return value;
	}
	
	public static int minus(int a, int b) {
		int value;
		if(a>=b) {
			value = a-b;
		} else {
			value = b-a;
		}
		return value;
	}
	
	public static int multi(int a, int b) {
		int value;
		value = a * b;
		return value;
	}
	
	public static double div(int a, int b) {
		double value;
		value = (double)a / b;
		return value;
	}
	
	public static void all(int a, int b) {
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
	}
	
	public static int arithmeticOperation(int a, int b, int c) {
		
		if(a==1) {
			return b + c;
		} else if(a==2) {
			return b - c;
		} else if(a==3) {
			return b * c;
		} else {
			return b / c;
		}
	}
	
		public static int[] arithmeticOperation2(int a, int b) {
		
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		int divide = a / b;
		int result[] = {plus, minus, multiply, divide};
		
		
		return result;
	}
	
}
