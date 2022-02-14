package ch04;

public class Aaa {

	public static void main(String[] args) {

		int a = 1;
		
		while(a<=10) {
			
			if(a%2 == 0) {
				continue;
			}
			
			a++;
			System.out.println(a);
		}
	}
}