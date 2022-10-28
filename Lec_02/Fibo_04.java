package Lec_02;

public class Fibo_04 {
	public static void main(String[] args) {
		
		int nth = 0;
		int count = 1;

		int a = 0;
		int b = 1;
		int c = 0;
		
		while (count <= nth) {
			c = a + b;
//			soln1
			a = b;
			b = c;
			
			count++;
		}
		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
	}
}
