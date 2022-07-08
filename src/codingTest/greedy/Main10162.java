package codingTest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10162 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int button[] = {300, 60, 10};
		int count[] = {0, 0, 0};
		
		for(int i=0; i<button.length; i++) {
			if((T / button[i]) > 0) {
				count[i] += (T / button[i]);
				T %= button[i];
			}
		}
		
		if(T == 0) {
			for(int i = 0; i<count.length; i++) {
				System.out.print(count[i] + " ");
			}

		} else {
			System.out.println(-1);
		}
		
		
	}
}
