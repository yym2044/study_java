package ch04;

public class IfNestedExample {

	public static void main(String[] args) {

		int score = 75;
		String grade = "";
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("점수가 100~95 사이입니다.");
				System.out.println("등급은 A+입니다.");
			} else {
				System.out.println("점수가 94~90 사이입니다.");
				System.out.println("등급은 A입니다.");
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("점수가 89~85 사이입니다.");
				System.out.println("등급은 B+입니다.");
			} else {
				System.out.println("점수가 84~80 사이입니다.");
				System.out.println("등급은 B입니다.");
			}
		} else if(score >= 70) {
			if(score >= 75) {
				System.out.println("점수가 79~75 사이입니다.");
				System.out.println("등급은 C+입니다.");
			} else {
				System.out.println("점수가 74~70 사이입니다.");
				System.out.println("등급은 C입니다.");
			}
		} else if(score >= 60) {
			if(score >= 65) {
				System.out.println("점수가 69~65 사이입니다.");
				System.out.println("등급은 D+입니다.");
			} else {
				System.out.println("점수가 64~60 사이입니다.");
				System.out.println("등급은 D입니다.");
			}
		} else {
			System.out.println("점수가 59 이하입니다.");
			System.out.println("등급은 F입니다. 정신차리세요");
		}
		
		System.out.println("학점 : " + grade);
	}

}
