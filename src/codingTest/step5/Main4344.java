package codingTest.step5;

import java.util.Scanner;

public class Main4344 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr;

		for (int i = 0; i < N; i++) {

			int M = sc.nextInt();
			arr = new int[M];

			int sum = 0;
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];

			}

			double avg = (double) (sum / arr.length);

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] > avg) {
					count++;
				}
			}
			

			double result = (double)count/M*100;
			
			System.out.printf("%.3f",result);
			System.out.println("%");
			
		}

	}
}