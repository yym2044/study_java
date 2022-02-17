package com.google.lecture.function;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("먹고 싶은 음식을 고르세요 : 한식 중식 일식 양식");

		String FC = scan.nextLine();

		food(FC);
	}

	public static void food(String FC) {

		String[] korean = { "떡볶이", "김밥", "비빔밥", "떡갈비", "김치찌개", "된장찌개", "김치볶음밥" };
		String[] chinese = { "짜장면", "짬뽕", "볶음밥", "탕수육", "춘권", "고추잡채" };
		String[] western = { "파스타", "리조또", "피자", "햄버거", "스테이크", "샐러드" };
		String[] japanese = { "초밥", "돈까스", "우동", "타꼬야끼", "사시미" };
		String[] menu = null;

		switch (FC) {
		case "한식":
			menu = korean;
			break;
		case "중식":
			menu = chinese;
			break;
		case "양식":
			menu = western;
			break;
		case "일식":
			menu = japanese;
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			System.exit(0);
		}

		int num = (int) (Math.random() * (menu.length + 1));

		printF(menu[num]);
	}

	public static void printF(String a) {
		System.out.println("오늘 추천 드리는 메뉴는 " + a + "입니다.");
	}
}
