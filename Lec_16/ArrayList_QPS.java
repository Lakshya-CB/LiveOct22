package Lec_16;

import java.util.ArrayList;

public class ArrayList_QPS {
	public static void main(String[] args) {
//		Find Intersection of 2 sorted arrays 
//		int[] arr1 = { 10, 10, 20, 30, 35, 35, 40, 50, 60, 120, 130 };
//		int[] arr2 = { 20, 32, 35, 35, 35, 50, 55, 64, 70 };
//		System.out.println(Intersection(arr1, arr2));
		int[] arr1 = { 9, 9, 9, 9 };
		int[] arr2 = { 1, };
		System.out.println(Sumof2Arrays(arr1, arr2));
	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {

		ArrayList<Integer> AL = new ArrayList<Integer>();
		int i1 = 0;
		int i2 = 0;
		while (i1 < arr1.length && i2 < arr2.length) {
			if (arr1[i1] > arr2[i2]) {
				i2++;
			} else if (arr1[i1] < arr2[i2]) {
				i1++;
			} else {
				AL.add(arr1[i1]);
				i1++;
				i2++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> Sumof2Arrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		int i1 = arr1.length - 1;
		int i2 = arr2.length - 1;
		int carry = 0;
		while (i1 >= 0 || i2 >= 0) {
			int sum = carry;
			if (i1 >= 0) {
				sum = sum + arr1[i1];
			}
			if (i2 >= 0) {
				sum = sum + arr2[i2];
			}
			
			
			carry = sum / 10;
			int digit = s
					.um % 10;
			AL.add(0, digit);
			i1--;
			i2--;
		}
		if (carry > 0) {
			AL.add(0, carry);

		}
		return AL;
	}
}
