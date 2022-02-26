package codingTest.step5;

import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = A * B * C;
		int count = 0;
		
		String str = String.valueOf(D);
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='2') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
