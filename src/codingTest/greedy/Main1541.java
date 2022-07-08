package codingTest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1541{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer subToken = new StringTokenizer(br.readLine(), "-");
		
		int sum = Integer.MAX_VALUE;
		
		while(subToken.hasMoreTokens()) {
			
			int tmp = 0;
			
			StringTokenizer sumToken = new StringTokenizer(subToken.nextToken(), "+");
			
			while(sumToken.hasMoreTokens()) {
				tmp += Integer.parseInt(sumToken.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = tmp;
			} else {
				sum -= tmp;
			}
			
		}
		
		System.out.println(sum);
		
	}
}