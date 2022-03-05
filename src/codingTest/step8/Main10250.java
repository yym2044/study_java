package codingTest.step8;

import java.util.Scanner;

public class Main10250 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int YY = 0;
			int XX = 0;
			int index = 0;

			Outter:
			for(int j=0;j<W;j++) {
				XX++;
				for(int k=0;k<H;k++) {
					
					YY++;
					index++;
					
					if(index==N) break Outter;
				}
				YY = 0;
			}

//			XX 에는 엘리베이터부터 방까지의 거리가 담기고
//			YY 에는 층수가 담긴다

			String str1;
			String str2;
			
			str1 = String.valueOf(YY);
			
			if(XX<10) {
				str2 = "0" + String.valueOf(XX);
			} else {
				str2 = String.valueOf(XX);
			}
			
			
			
			System.out.println(str1 + str2);
			
		}
		
	}
	
}
