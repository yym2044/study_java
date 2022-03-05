package codingTest.step9;

import java.util.Scanner;

public class Main2581 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // ex) 11
		int N = sc.nextInt(); // ex) 20

		sc.close();

		int tmp = M; // ex) 11
		int sum = 0;
		int firstPrimeNum = 0;

		boolean[] arr = new boolean[N - M + 1]; // M부터 N까지의 정수 각각이 소수인지 아닌지를 나타내는 boolean배열 생성 (M이상 N이하의 정수의 개수는 N-M+1)
												// ex) boolean[10]

		for (int i = 0; i < arr.length; i++) {

			arr[i] = isPrimeNumber(tmp); // M값을 복사한 변수 tmp를 활용하여 배열에 데이터를 넣어준다. ex) arr[0] = isPrimeNumber(11)

			if (arr[i]) { // arr[i]가 true경우에만, 즉, 정수 tmp가 소수인 경우에만 변수 sum에 소수인 tmp를 더해준다.
				sum += tmp;
			}

			tmp++; // 반복문을 돌면서 tmp를 1씩 증가시켜준다.
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) { // arr 배열 내에서 true인 값이 처음 나오는 순간의 i에 M을 더하면 범위 내 처음으로 등장하는 소수가 된다.
				firstPrimeNum = M + i; // ex i : 0 , M : 11 -> firstPrimeNum = 11
				break; // break 문을 통해 반복문을 바로 탈출하여 firstPrimeNum이 갱신되지 않도록 한다.
			}
		}

		if (sum == 0 & firstPrimeNum == 0) { // 범위 내에 소수가 없다는 조건
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(firstPrimeNum);
		}

	}

	public static boolean isPrimeNumber(int a) { // a가 소수인지 아닌지 판별하는 함수

		int divider = a - 1; // a를 나눠줄 수 divider

		if (a <= 1) { // 소수는 2부터 시작이므로, 1 이하일 경우 소수가 아님
			return false;
		}

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