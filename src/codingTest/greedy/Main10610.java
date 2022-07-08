package codingTest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10610 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int[] num = new int[N.length()];
		int totalNum = 0;
		
		for(int i = 0; i<num.length; i++) {
			num[i] = N.charAt(i) - 48;
			totalNum += num[i];
		}
		
		Arrays.sort(num);
		
		if(num[0] == 0 && totalNum % 3 == 0) {
			for(int i = num.length - 1; i >= 0 ; i--) {
				System.out.print(num[i]);
			}
		} else {
			System.out.println(-1);
		}
		
		
	}
}
