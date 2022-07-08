package codingTest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5585 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int change = 1000 - Integer.parseInt(br.readLine());
		
		int count = 0;
		
		int[] ch = {500, 100, 50, 10, 5, 1};
		
		for(int i=0; i<ch.length; i++) {
			if((change / ch[i]) > 0) {
				count += (change / ch[i]);
				change %= ch[i];
			}
		}
		
		System.out.println(count);
		
	}
}