package ch03;

public class ConditionalOpertorExample {
	
	public static void main(String[] args) {
		
		int score = 85;
		
		char grade = (score > 90 ? 'A' : 'B');
		char grade2 = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));
		
		System.out.println("grade = " + grade);
		System.out.println("grade2 = " + grade2);
		
		
		
	}

}
