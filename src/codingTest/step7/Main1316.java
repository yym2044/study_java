package codingTest.step7;

import java.util.Scanner;

public class Main1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int count = N;

		for (int i = 0; i < N; i++) {

			String str = sc.next();

			int[] used = new int[26];

			for (int j = 0; j < str.length(); j++) {

				if (used[str.charAt(j) - 97] == 0) {
					
					used[str.charAt(j) - 97]++;
					
				} 
				
				else {
					if (str.charAt(j) == str.charAt(j - 1)) {
						continue;
					} else {
						count--;
						break;
					}
				}

			}

		}
		
		System.out.println(count);

	}

}