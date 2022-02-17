package com.google.lecture.function;

public class Exc {

	public static void main(String[] args) {
		
		System.out.println(menu("중식"));
		
	}
	
	public static String menu(String a) {
		
		String[] todaysmenu = {"칼국수", "파스타", "라멘", "짜장면"};
		
		String value = "";
		
		switch(a) {
		case "한식":
			value = todaysmenu[0];
			break;
		case "양식":
			value = todaysmenu[1];
			break;
		case "일식":
			value = todaysmenu[2];
			break;
		case "중식":
			value = todaysmenu[3];
			break;
		default:
			value = "공기밥";
			break;
		}
		return "오늘의 메뉴는 " + value + "입니다.";
	}
	
}


//if(a=="한식")
//value = todaysmenu[0];
//else if(a=="양식")
//value = todaysmenu[1];
//else if(a=="일식")
//value = todaysmenu[2];
//else if(a=="중식")
//value = todaysmenu[3];
//else
//value = "공기밥";