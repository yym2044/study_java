package codingTest.step8;

import java.util.Scanner;

public class Main2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		int bag = 0;

//		N = 5X + 3Y

		
		if((N/5)%3==0) {
			bag = bag + (N/5);
			N /= 5;
		} else
		
		System.out.println(N);
		System.out.println(bag);
	}

}
