package Lec_02;

import java.util.Scanner;

public class sumOfnNatural02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 1;
		int sum = 0;
		while (count <= num) {
			
			sum = sum +count;
			count++;
		}
		System.out.println(sum);
	}
}
