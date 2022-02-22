package codingTest;

import java.util.Scanner;

public class Main1152 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		if(str.indexOf(" ")==0 && str.length()<1000000) {
			System.out.println(arr.length-1);
		} else if(str.indexOf(" ")!=0 && str.length()<1000000) {
			System.out.println(arr.length);
		}
		
	}
	
}
