package com.google.lecture.ch13;

public class BoxingMethodExample {

	public static void main(String[] args) {
		
//		Box<Integer> box = new Box<Integer>();

		Box<Integer> box = Util.<Integer>boxing(100);
		int rtInt = box.getT();
		
		System.out.println(rtInt);
		
		Box<String> box2 = Util.<String>boxing("Tony");
		String rtString = box2.getT();
		
		System.out.println(rtString);
	}

}
