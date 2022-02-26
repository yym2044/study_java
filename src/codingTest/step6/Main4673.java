package codingTest.step6;

public class Main4673 {

	public static void main(String[] args) {

		
		boolean[] isNotSelfNumber = new boolean[10001];		// for문에서 1~10000까지 돌릴거기 때문에 크기 10001짜리 생성, index 0은 사용안함
		
		for (int i = 1; i <= 10000; i++) {
			if(d(i)<=10000) {
				isNotSelfNumber[d(i)] = true;
			}
		}

		for(int i=1;i<=10000;i++) {
			if(isNotSelfNumber[i]==false) {
				System.out.println(i);
			}
		}
		
	}

//	d(n) 함수

	public static int d(int n) {

		int result = n;

		while (n != 0) {
			result += n % 10;
			n /= 10;
		}

		return result;
	}

}
