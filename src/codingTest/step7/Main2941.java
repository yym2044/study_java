package codingTest.step7;

import java.util.Scanner;

public class Main2941 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int count = str.length();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '-') {
				count--;
			}

			if (i>=1 && str.charAt(i) == 'j') {
				if (str.charAt(i - 1) == 'n' || str.charAt(i - 1) == 'l') {
					count--;
				}
			}

			if (str.charAt(i) == '=') {
				if (i>=2 && str.charAt(i - 1) == 'z' && str.charAt(i - 2) == 'd') {
					count -= 2;
				} else {
					count--;
				}
			}
			

		}

		System.out.println(count);

	}
}