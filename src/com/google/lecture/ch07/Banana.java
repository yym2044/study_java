package com.google.lecture.ch07;

public class Banana extends Apple {

	private String strBanana = "strBanana";
	
	public String getStrBanana() {
		return strBanana;
	}

	public void setStrBanana(String strBanana) {
		this.strBanana = strBanana;
	}

	public void printBanana() {
		System.out.println("Banana");
	}
}
