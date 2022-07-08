package codingTest.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.nextLine();
		
		int arr[] = new int[N];
		int sum = 0;
		int j = N;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i] * j;
			j--;
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}