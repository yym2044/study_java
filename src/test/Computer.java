package test;

public class Computer extends Calculator {

	@Override
	public double circleArea(double R) {
		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		
		double result = Constants.PAI_2 * R * R;
		
		return result;
	}
	
	
}
