package Lec_09;

import java.util.Scanner;

public class Array_demo_2_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("====");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		System.out.println("sdfsdfdsf");
	}
}
