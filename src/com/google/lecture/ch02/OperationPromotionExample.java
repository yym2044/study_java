package com.google.lecture.ch02;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
// 연산 시 형이 다른 경우에는 큰 형으로 자동 형변환 long은 예외
		
		int a = 10;
		double b = 10.0;
		
		// int c = (a + b); 에러
		
		int d = (int) (a + b);
		System.out.println(d);

		int e = a + (int) b;
		System.out.println(e);
		
		double f = a + b;
		System.out.println(f);
		
//		정수형 연산은 int로 자동 형변환된다.
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// byte byteValue3 = byteValue1 + byteValue2; 에러
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
		System.out.println("byteValue3 : " + byteValue3);
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue1 : " + intValue1);
		
//   	char 은 int 와 연산 가능하다. char가 int로 자동 형변환
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; 에러
		
		char charValue3 = (char)(charValue1 + charValue2);
		System.out.println("charValue3 : " + charValue3);
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("intValue2 : " + intValue2);
		
//
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println("intValue4 : " + intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;	//에러
		double doubleValue = intValue5 / 4.0;
		System.out.println("doubleValue : " + doubleValue);
		
//		
		
		long aa = 1;
		long bb = 2;
		
		long cc = aa + bb;
		System.out.println("cc : " + cc);
		
		short aaa = 1;
		short bbb = 2;
		// short ccc = aaa + bbb; //에러
		
		long ddd = aaa + bbb;
		System.out.println(ddd);
		
	}
	

}
