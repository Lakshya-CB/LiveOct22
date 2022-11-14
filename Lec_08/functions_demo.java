package Lec_08;

public class functions_demo {
	public static void main(String[] args) {
		fn();
		add(1, 2);

		int ans = add(30,50);
		System.out.println(ans*1000);
		
		System.out.println(compare(10,2));

	}

	// void => return type
	// public static => tattoo
//	0 input arguments 
	public static void fn() {
		System.out.println("nacho!!!");
	}

	public static int add(int a, int b) {
		System.out.println(a + b);
		return a+b;
	}
	
	public static boolean compare(int a, int b) {
		return a>b;
	}

}
