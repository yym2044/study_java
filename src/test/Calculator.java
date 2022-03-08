package test;

public class Calculator {

	public double circleArea(double R) {
		
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		
		double result = Constants.PAI_1 * R * R;
		
		return result;
	}
	
}
