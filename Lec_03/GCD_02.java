package Lec_03;

public class GCD_02 {
	public static void main(String[] args) {
		int n1 = 18;
		int n2 = 32;
		int divisor = n1;
		int dividend = n2;
		while(divisor>0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
