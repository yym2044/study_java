package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];	// 입력받는 배열
		int[] arr42 = new int[10];  // 나머지 저장 배열
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			arr42[i] = arr[i]%42;
		}
		
		
		Arrays.sort(arr42);
		
		int count = 0;
		int index = 0;
		
		
		
		System.out.println(count);
	}
}