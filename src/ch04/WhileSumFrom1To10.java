package ch04;

public class WhileSumFrom1To10 {

	public static void main(String[] args) {

		int i=1;
		int sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ 10 합 : " + sum);
		
	}

}
