package Lec_08;

public class Armstrongnumber {
	public static void main(String[] args) {
		int n = 10000;
		printArm(n);
	}

	public static void printArm(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArmstrong(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArmstrong(int num) {
		int nod = num_digit(num);
		int baack_up = num;
		int sum =0;
		while(num!=0) {
			int digit = num%10;
			sum = sum + (int)Math.pow(digit, nod);
			num = num/10;
		}
		if(sum==baack_up) {
			return true;
		}else {
			return false;
		}
	}

	public static int num_digit(int num) {
		int ans = 0;
		while(num>0) {
			num = num/10;
			ans++;
		}
		return ans;
	}
}
