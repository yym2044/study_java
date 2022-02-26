package codingTest.step8;

import java.util.Scanner;

public class Main2869 {
//시간초과 실패
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int H = 0;
		int day = 0;
		
		while(H<=V) {
			day++;
			H += A;
			if(H>=V) {
				break;
			}
			H -= B;
		}
		
		System.out.println(day);
	}

}
