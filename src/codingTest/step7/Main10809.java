package codingTest.step7;

import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		for(int i=97;i<123;i++){

		int index = 0;
		
			for(int j=0;j<str.length();j++) {

				if((char)i==str.charAt(j)) {
					
					index = j;
					break;
				} else {
					index = -1;
				}
				
			}
			System.out.print(index + " ");
		}
		
	}

}
