package ch04;

public class GuGuDan {

	public static void main(String[] args) {
		
		System.out.println("구구단을 외자");
		for(int i=2; i<=19; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=19; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		System.out.println();
		}
	}
}
