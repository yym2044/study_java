package com.google.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("윤영민", "960607-1234567", 15011786);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2 = new Student("윤영민2", "123456-1234567");
			
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
	}

}
