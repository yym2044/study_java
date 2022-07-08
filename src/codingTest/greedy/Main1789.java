package codingTest.greedy;

import java.util.Scanner;

public class Main1789 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();
		
		long sum = 0;
		int N = 0;
		
		while(sum < S) {
			N++;
			sum += N;
		}
		
		if(sum == S) {
			System.out.println(N);
		} else {
			System.out.println(N-1);
		}
		
	}
}
