package Lec_05;

import java.util.Scanner;

public class Pat_0 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int cnt_st = 0;
		while(cnt_st<n) {
			System.out.print("*");
			cnt_st++;
		}
	}
}
