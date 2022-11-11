package Lec_03;

public class Reverse_Digits_03 {
	public static void main(String[] args) {
		int num = 123;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
//			System.out.print(digit);
			ans = ans*10+digit;
		}
		System.out.println(ans);
	}
}
