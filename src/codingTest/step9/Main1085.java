package codingTest.step9;

import java.util.Scanner;

public class Main1085 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x_distance = (x>w-x)?w-x:x;
		int y_distance = (y>h-y)?h-y:y;
		
		System.out.println((x_distance>y_distance)?y_distance:x_distance);
		
	}
}