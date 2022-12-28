package Lec_Rec_Array;

import java.util.Arrays;

public class Array_Rec_All_Occ {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 4, 2, 60, 2 };
//		int[] ans = All_Occ(0, 0, arr, 2);
		int[] ans = suvle(arr, 0, 2);

		System.out.println(Arrays.toString(ans));

	}

	public static int[] All_Occ(int s, int total, int[] arr, int ali) {
		if (s == arr.length) {
			return new int[total];
		}
		if (arr[s] == ali) {
			int[] sp = All_Occ(s + 1, total + 1, arr, ali);
			sp[total] = s;
			return sp;
		} else {
			int[] sp = All_Occ(s + 1, total, arr, ali);
			return sp;
		}
	}

	public static int[] suvle(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return new int[0];
		}	
		
		int[] sp = suvle(arr, s + 1, ali);
		if (arr[s] == ali) {
			int[] ans = new int[sp.length + 1];
			ans[0] = s;
			for (int i = 0; i < sp.length; i++) {
				ans[i + 1] = sp[i];
			}
			return ans;

		} else {
			return sp;
		}
	}
}
