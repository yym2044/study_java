package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2{
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer stk = new StringTokenizer(str);
		
		String str1 = stk.nextToken();
		String str2 = stk.nextToken();
		
		char[] ch1 = new char[3];
		char[] ch2 = new char[3];
		
		for(int i=0;i<3;i++) {
			ch1[i] = str1.charAt(i);
			ch2[i] = str2.charAt(i);
		}
		
		char tmp1 = ch1[0];
		ch1[0] = ch1[2];
		ch1[2] = tmp1;
		
		char tmp2 = ch2[0];
		ch2[0] = ch2[2];
		ch2[2] = tmp2;
		
		str1 = String.valueOf(ch1);
		str2 = String.valueOf(ch2);
		
		
		if(Integer.parseInt(str1)>Integer.parseInt(str2)) {
			System.out.println(str1);
		} else if(Integer.parseInt(str2)>Integer.parseInt(str1)) {
			System.out.println(str2);
		}
	}
}