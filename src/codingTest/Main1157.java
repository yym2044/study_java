package codingTest;

import java.util.Scanner;

public class Main1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str2 = str.toUpperCase();
		
		int count = 0;
		int[] arr = new int[26];
		

//		배열에 알파벳별 개수를 저장
		for(int i=65;i<=90;i++) {
			
			arr[i-65] = count(str2, (char)i);
			
		}

		
//		최대 개수 값을 담을 max 변수 초기화
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		

		
//		ifSameValue 변수는 배열내에 max값이 중복되는 경우(가장 많이 사용된 알파벳이 여러 개 존재하는 경우) 카운트된다.
		
		
		int ifSameValue = 0;
		char Alphabet = 'A';
		
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				ifSameValue++;
				Alphabet = (char)(i+65);
			}
		}
		
		if(ifSameValue==1) {
			System.out.println(Alphabet);
		} else {
			System.out.println("?");
		}
		
		
	}
	
	public static int count(String str, char ch) {
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		return count;
	}

}
