package Lec_06;

import java.util.Scanner;

public class Shopping_game_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int A = scn.nextInt();
			int H = scn.nextInt();
			int num = 1;
			while (true) {
				if (A >= num) {
					A = A - num;
				} else {
					System.out.println("Harshit");
					break;
				}
				num = num + 1;
				if (H >= num) {
					H = H - num;
				} else {
					System.out.println("Ayush");
					break;
				}

			}

			t--;
		}
	}
}
