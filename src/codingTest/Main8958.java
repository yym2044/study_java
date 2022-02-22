package codingTest;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		테스트 케이스의 개수
		int caseNum = sc.nextInt();
		
//		케이스 배열
		String[] Case = new String[caseNum];
		
		for(int i=0;i<caseNum;i++) {
			Case[i] = sc.next();
		}


		for(int i=0;i<caseNum;i++) {
			
			int sum = 0;
			int count = 0;
			
			for(int j=0;j<Case[i].length();j++) {
				if(Case[i].charAt(j)=='O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
		
		
	}

}
