package ch04;

public class Test2 {

	public static void main(String[] args) {

		int a=0, b=0, c=0, d=0, e=0, f=0;
		
		a = (int) (Math.random() * 45 + 1);
		b = (int) (Math.random() * 45 + 1);
		c = (int) (Math.random() * 45 + 1);
		d = (int) (Math.random() * 45 + 1);
		e = (int) (Math.random() * 45 + 1);
		f = (int) (Math.random() * 45 + 1);
		
		if(a!=b && b!=c && c!=d && d!=e && e!=f) {
			System.out.println("중복없음");
		} else {
			a = (int) (Math.random() * 45 + 1);
			b = (int) (Math.random() * 45 + 1);
			c = (int) (Math.random() * 45 + 1);
			d = (int) (Math.random() * 45 + 1);
			e = (int) (Math.random() * 45 + 1);
			f = (int) (Math.random() * 45 + 1);
		}
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
	}

}
