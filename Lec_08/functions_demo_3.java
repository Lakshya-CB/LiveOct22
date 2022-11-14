package Lec_08;

public class functions_demo_3 {

	static int var = 100;

	public static void main(String[] args) {
		System.out.println(var);
		var++;

		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
		
		System.out.println(var);
	}

	public static void swap(int a, int b) {
		System.out.println(var);
		var++;

		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}

}
