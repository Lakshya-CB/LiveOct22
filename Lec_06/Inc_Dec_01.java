package Lec_06;

import java.util.Scanner;

public class Inc_Dec_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int prev = Integer.MAX_VALUE;
		int isDec = 1;
		int slapped = 0;
		while (n > 0) {
			int curr = scn.nextInt();
//			System.out.println(curr + " - " + prev);
			if (isDec == 1 && prev < curr) {
				isDec = 0;
			} else if (isDec == 0 && curr < prev) {
//				System.out.println("false");
//				break;
				slapped = 1;
			}
			
			if(curr==prev) {
				slapped = 1;
			}
			prev = curr;
			n--;
		}
		if (slapped == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
