package codingTest.step8;

import java.util.Scanner;

public class Main2869_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int Day = (V-B)/(A-B);
		
		if((V-B)%(A-B)!=0) {
			Day++;
		}
		
		System.out.println(Day);
		
		
		
	}

}
