package com.google.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.setName("윤석열");
		myFriendDetailInfo.setAge(50);
		myFriendDetailInfo.setAddress("대한민국 어딘가");
		myFriendDetailInfo.setContact("010-1234-5678");
		
		System.out.println("이름 : " + myFriendDetailInfo.getName());
		System.out.println("나이 : " + myFriendDetailInfo.getAge());
		System.out.println("주소 : " + myFriendDetailInfo.getAddress());
		System.out.println("연락처 : " +myFriendDetailInfo.getContact());
		
	}

}
