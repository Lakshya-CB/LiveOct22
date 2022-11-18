package Lec_10;

public class Arrays_QPS_Basic {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 13, 9, 200, 3, -14 };
//		System.out.println(Max(arr));
//		System.out.println(FUnd(arr, 4));
		print(arr);
		Reverse(arr);
		print(arr);
		
		
	}
	public static void print(int[] arr) {
		for(int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
		
	}
	
	public static int Max(int[] boori) {
//		int jeb = Integer.MIN_VALUE;
		int jeb = boori[0];

		for (int aam : boori) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int FUnd(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}
	public static void Reverse(int[] arr) {
		int L = 0;
		int R = arr.length-1;
		while(L<R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
}
