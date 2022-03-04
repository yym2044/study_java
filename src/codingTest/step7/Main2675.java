package codingTest.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2675{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			
//			String[] str = br.readLine().split(" ");					//split
			StringTokenizer STK = new StringTokenizer(br.readLine());	//Tokenizer
			
//			int R = Integer.parseInt(str[0]);							//split
			int R = Integer.parseInt(STK.nextToken());					//Tokenizer
			
//			String S = str[1];
			String S = STK.nextToken();
			
			for(int j=0;j<S.length();j++) {
				
				for(int k=0;k<R;k++) {
					
					System.out.print(S.charAt(j));
					
				}
				
			}
			
			
			System.out.println();
		}
		
	}
}
