package codingTest.step7;

import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int R;
		String S;
		String P;
		
		for(int i=0;i<T;i++) {
			
			R = sc.nextInt();
			S = sc.next();
			
			P = S.repeat(R);
			System.out.println(P);
		}
		
	}
	
}
