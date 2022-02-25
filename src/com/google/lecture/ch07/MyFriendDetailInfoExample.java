package com.google.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.setName("윤석열");
		myFriendDetailInfo.setAge(50);
		myFriendDetailInfo.setAddress("대한민국 어딘가");
		myFriendDetailInfo.setContact("010-1234-5678");
		
		System.out.println(myFriendDetailInfo.getName());
		System.out.println(myFriendDetailInfo.getAge());
		System.out.println(myFriendDetailInfo.getAddress());
		System.out.println(myFriendDetailInfo.getContact());
		
	}

}
