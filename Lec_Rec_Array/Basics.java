package Lec_Rec_Array;

public class Basics {
	public static void main(String[] args) {
//		System.out.println(Fact(5));
		System.out.println(Fib(6));
	}

//	
	public static int Fact(int n) {
		if (n == 0) {
			return 1;
		}
//		BP : Fact(n)
//		SP : Fact(n-1)

		int sp = Fact(n - 1);
		return sp * n;
	}

	public static int Pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
//		BP : Pow(a,b)
//		SP : Pow(a,b-1)
		int sp = Pow(a, b - 1);
		return sp * a;
	}

	public static int Fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
//		BP : Fib(n)
//		SP : Fib(n-1) and Fib(n-2)
		int sp1 = Fib(n - 1);
		int sp2 = Fib(n - 2);
		return sp1 + sp2;
	}
}
