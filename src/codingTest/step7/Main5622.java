package codingTest.step7;

import java.util.Scanner;

public class Main5622{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int[] arr = new int[str.length()];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {			// A : 65, Z : 90
			
			if(str.charAt(i)<=67) {
				arr[i] = 2 + 1;
			} else if(str.charAt(i)<=70) {
				arr[i] = 3 + 1;
			} else if(str.charAt(i)<=73) {
				arr[i] = 4 + 1;
			} else if(str.charAt(i)<=76) {
				arr[i] = 5 + 1;
			} else if(str.charAt(i)<=79) {
				arr[i] = 6 + 1;
			} else if(str.charAt(i)<=83) {
				arr[i] = 7 + 1;
			} else if(str.charAt(i)<=86) {
				arr[i] = 8 + 1;
			} else {
				arr[i] = 9 + 1;
			}
			
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
}