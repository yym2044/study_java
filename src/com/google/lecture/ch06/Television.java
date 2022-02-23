package com.google.lecture.ch06;

public class Television {

	public static String company = "Samsung";
	public static String model = "OLED";
	public static String info;
	public static String info2 = company + " " + model;
	
	static {
		info = company + " " + model;
	}
}
