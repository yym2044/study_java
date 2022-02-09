package ch03;

public class SignOperatorExample {

	public static void main(String[] args) {

		int x = -100;
		
		int result1 = +x;
		
		int result2 = -x;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		
		short s = 100;
//		short result3 = -s; //컴파일 익셉션 (연산 과정에서 int로 형변환이 되었기 때문)
		int result3 = -s;
		System.out.println("result3 = " + result3);
		
		
		
		
	}

}
