package codingTest.step9;

import java.util.Scanner;

public class Main11653_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();			//ex)72
		
		sc.close();
		
		int tmp = N;					//ex)72
		int Prime = 2;
		
		while(tmp!=1) {
			
			if(isPrimeNum(Prime)==false) {
				Prime++;
				continue;
			}
			
			if(tmp%Prime==0) {	
				
				System.out.println(Prime);		// 2 출력 , 2 출력	2 출력	3출력
				tmp /= Prime;					// 36 	, 18	9		3
												// 2	2 		2		3
			} else {
				Prime++;
			}
			
		}
		
	}
	
	
	public static boolean isPrimeNum(int a) {
		
		if(a<=1) return false;
		
		for(int i=a-1;i>1;i--) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}