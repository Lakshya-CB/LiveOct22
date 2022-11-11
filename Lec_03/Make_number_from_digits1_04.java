package Lec_03;

import java.util.Scanner;

public class Make_number_from_digits1_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int total_digits = scn.nextInt();
		int count = 1;
		int mult = 1;
		int ans = 0;

		while (count <= total_digits) {
			int digit = scn.nextInt();
			
//			mult = mult*10;
			ans = ans + digit * mult;
//			mult = mult*10;
			
			count++;
		}
		System.out.println(ans);
	}
}
