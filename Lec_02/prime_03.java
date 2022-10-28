package Lec_02;

import java.util.Scanner;

public class prime_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int div = 1;
		int factors = 0;
		while (div <= num) {
			int rem = num % div;
			System.out.println(div);
			if (rem == 0) {
				factors = factors + 1; 
			}
			div = div + 1;
		}
		if(factors == 2) {
			System.out.println("Pime");
		}else {
			System.out.println("Not prime");
		}
	}
}
