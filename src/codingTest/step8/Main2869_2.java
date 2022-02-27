package codingTest.step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2869_2 {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int A = Integer.parseInt(s.split(" ")[0]);
		int B = Integer.parseInt(s.split(" ")[1]);
		int V = Integer.parseInt(s.split(" ")[2]);
		
		int Day = (V-B)/(A-B);
		
		if((V-B)%(A-B)!=0) {
			Day++;
		}
		
		System.out.println(Day);
		
		
		
	}

}
