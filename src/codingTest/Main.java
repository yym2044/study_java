package codingTest;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		int tem = N;
		
		for(int i=2;i<Math.sqrt(N);i++) {
			
			if(N%i==0) {
				System.out.println(i);
				N /= i;
				i--;
			} else {
				continue;
			}
			
		}
		
	}
}