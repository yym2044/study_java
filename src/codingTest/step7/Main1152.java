package codingTest.step7;

import java.util.Scanner;

public class Main1152 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		
		String[] arr = str.split(" ");
		
		if(str.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(arr.length);
		}
		
	}
}