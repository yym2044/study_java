//접근제한자

package com.google.lecture.ch06;

public class ModifierFirst {

	public String name = "";
	public String ssn = "";
	
	public ModifierFirst(String ssn) {
		this.ssn = ssn;
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
}
