package codingTest.step8;

import java.util.Scanner;

public class Main2839 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int b5 = N / 5;
		
		int R = N % 5;
		
		int ans = 0;
		
		if(R==0) {
			ans = b5;
		} else if(R==1 && b5>=1) {
			ans = b5 - 1 + 2;
		} else if(R==2 && b5>=2) {
			ans = b5 - 2 + 4;
		} else if(R==3) {
			ans = b5 + 1;
		} else if(R==4 && b5>=1) {
			ans = b5 - 1 + 3;
		} else {
			ans = -1;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}