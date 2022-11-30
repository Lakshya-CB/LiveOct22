package Lec_13;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
//		int[] arr = { 10, 20, 30, 40, 3 };
		System.out.println("input =>"+Arrays.toString(arr));
//		bubble(arr);
		Insertion(arr);
		System.out.println("Final" + Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
//			for (int s = 0; s <= arr.length - 2; s++) {
			for (int s = 0; s <= arr.length - 1 - count; s++) {

//			 s and s+1
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void Selection(int[] arr) {
		for (int last_idx = arr.length - 1; last_idx >= 1; last_idx--) {
			int max = 0;
			for (int i = 0; i <= last_idx; i++) {
				if (arr[max] < arr[i]) {
					max = i;
				}
			}
//		max aagya and last idx!
//		chaap
			int temp = arr[max];
			arr[max] = arr[last_idx];
			arr[last_idx] = temp;
		}
	}

	public static void Insertion(int[] arr) {
		for (int last_idx = 1; last_idx <= arr.length - 1; last_idx++) {
			int ali = arr[last_idx];
			int idx = last_idx - 1;
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			System.out.println(Arrays.toString(arr));
		}
	}
}
