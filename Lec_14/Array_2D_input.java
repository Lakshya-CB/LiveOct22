package Lec_14;

import java.util.Scanner;

public class Array_2D_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num_row = scn.nextInt();
		int num_col = scn.nextInt();

		int[][] mat = new int[num_row][num_col];
		
		for(int r = 0;r<mat.length;r++) {
			for(int c = 0;c<mat.length;c++) {
				mat[r][c] = scn.nextInt();
			}
		}
	}
}
