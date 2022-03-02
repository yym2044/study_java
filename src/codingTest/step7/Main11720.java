package codingTest.step7;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			sum += str.charAt(i)-'0';	// 아스키코드 값에 -'0' 또는 -48을 해서 정상적인 숫자를 얻는다.
		}
		
		System.out.println(sum);
		
	}

}
