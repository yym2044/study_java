package codingTest.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2217 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Integer[] weight = new Integer[N];
		Integer[] maxWeight = new Integer[N];
		
		for(int i=0; i<N; i++) {
			weight[i] = sc.nextInt();
		}
		
		Arrays.sort(weight, Collections.reverseOrder());
		
		int ans = Integer.MIN_VALUE;
		
		for(int i=0; i<maxWeight.length; i++) {
			maxWeight[i] = weight[i] * (i+1);
			if(ans < maxWeight[i]) {
				ans = maxWeight[i];
			}
		}
		
		System.out.println(ans);
		
		
		
	}
}
