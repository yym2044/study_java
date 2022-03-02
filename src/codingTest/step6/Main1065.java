package codingTest.step6;

import java.util.Scanner;

public class Main1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[1000];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = isHansoo(i+1);
		}

		int N = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<N;i++) {
			
			if(arr[i] == true) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	public static boolean isHansoo(int a) {		// a는 1부터 1000까지의 수
		
		if(a<100) {
			return true;
		} else {
			
			if((a/100) - ((a/10)%10) == ((a/10)%10) - (a%10)) {
				return true;
			}
			
		}
		
		return false;
		
	}

}
