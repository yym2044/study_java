package test;

public class ComputerExample {

	public static void main(String[] args) {
	
	int R = 7;
	
	System.out.println("원의 반지름: " + R);
	System.out.println();
	
	Calculator calculator = new Calculator();
	System.out.println("원면적: " + calculator.circleArea(R));
	System.out.println();
	
	Computer computer = new Computer();
	System.out.println("원면적: " + computer.circleArea(R));
	
	}
	
}
