package ch04;

public class Test {

	public static void main(String[] args) {

		int evensum = 0;
		int oddsum = 0;
		
		
		for(int i=2; i<=9; i++) {
			System.out.println();
			System.out.println("---- " + i + "단" + " ----");
			for(int j=1; j<=9; j++) {
				
				System.out.println(i + " × " + j + " = " + i*j);
				
				if(i*j%2==0) {
					evensum += i*j;
				} else {
					oddsum += i*j;
				}
				
			}
		}
		System.out.println();
		System.out.println("홀수합 = " + oddsum);
		System.out.println("짝수합 = " + evensum);
		
		
	}

}
