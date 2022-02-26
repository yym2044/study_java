package codingTest.step5;

import java.util.Scanner;

public class Main2577_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = A * B * C;

//		둘다 가능
//		String str = String.valueOf(D);
		String str = Integer.toString(D);

//		정수 48은 char 0
//		정수 57은 char 9

		for (int i = 48; i <= 57; i++) {
			System.out.println(count(str, (char) i));
		}

	}

	public static int count(String str, char ch) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;

	}

}
