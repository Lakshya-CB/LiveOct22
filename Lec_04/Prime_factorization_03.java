package Lec_04;

import java.util.Scanner;

public class Prime_factorization_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int div = 2;
		int count = 0;
		while (num > 1) {
			if (num % div == 0) {
				if (count == 0) {
					System.out.println(div);
				}
				count++;
				num = num / div;
			} else {
				div++;
				count = 0;
			}
		}
	}
}
