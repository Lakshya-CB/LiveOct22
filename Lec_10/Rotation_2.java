package Lec_10;

public class Rotation_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		solve(arr, 13);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();

	}

	public static void Reverse(int[] arr, int L, int R) {

		while (L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}

	public static void solve(int[] arr, int rot) {
		rot = rot % arr.length;
//		Step 1 : Reverse!!
		Reverse(arr, 0, arr.length - 1);
		print(arr);
//		Step 2: 
		Reverse(arr, 0, rot - 1);
		print(arr);
//		Step 3:
		Reverse(arr, rot, arr.length - 1);
		print(arr);
	}
}
