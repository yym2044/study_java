package codingTest.step10;

import java.util.Scanner;

public class Main10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(Fibonacci(N));
		
	}
	
	public static int Fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		
		return Fibonacci(N - 1) + Fibonacci(N - 2);
	}
	
}
