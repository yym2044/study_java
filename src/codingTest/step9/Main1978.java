package codingTest.step9;

import java.util.Scanner;

public class Main1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();		// 숫자 입력 받을 횟수
		
		int count = 0;				// 소수의 개수를 저장하는 변수

		for (int i = 0; i < N; i++) {

			int num = sc.nextInt();

			if (isPrimeNumber(num))
				count++;

		}

		sc.close();

		System.out.println(count);

	}

	public static boolean isPrimeNumber(int a) { // a가 소수인지 아닌지 판별하는 함수


		if (a <= 1) { // 소수는 2부터 시작이므로, 1 이하일 경우 소수가 아님
			return false;
		}
		
		int divider = a - 1; // a를 나눠줄 수 divider

		while (divider != 1) {

			if (a % divider == 0) { // a가 divider로 나누어떨어진다면 = divider가 a의 약수라면 -> a는 소수가 아님 (소수 : 1보다 큰 자연수 중 1과 자기
									// 자신만을 약수로 가지는 자연수)
				return false;
			}

			divider--; // divider를 1 줄이고 다시 반복문 실행 (divider가 1이 되는 경우 반복문 종료)
		}

		return true; // while 반복문을 도는 동안 false 조건에 걸리는게 없었다면 true를 반환

	}

}