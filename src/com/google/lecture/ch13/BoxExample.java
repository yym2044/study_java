package com.google.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		
		box.setT("장원영");
		String str = box.getT();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		
		box2.setT(1);
		int a = box2.getT();
		System.out.println(a);
	}
	
}
