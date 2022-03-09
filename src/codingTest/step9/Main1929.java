package codingTest.step9;

import java.util.Scanner;

public class Main1929{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		sc.close();
		
		for(int i=M;i<=N;i++) {
			
			if(isPrimeNum(i)) {
				System.out.println(i);
			}
			
		}
		
	
	}
	
	public static boolean isPrimeNum(int a) {
		
		if(a<2) return false;
		
		for(int i=2;i<a;i++) {
			
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	
}