package Lec_Pattern_Rec_1;

public class Basic_1 {
	public static void main(String[] args) {
//		PD(4);
//		PI(4);
//		PDI(4);
		PID(1, 4);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
//		BP : PD(n)
//		SP : PD(n-1)
		System.out.println(n); // self work
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
//		BP  : PI(n)
//		SP  : PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PI2(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PI2(s,e)
//		SP : PI2(s+1,e)
		System.out.println(s);
		PI2(s + 1, e);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)

		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}

}
