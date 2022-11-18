package Lec_10;

public class Rotation_ {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		solve(arr, 13);
		print(arr);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();

	}

	public static void solve(int[] arr, int rot) {
		rot = rot % arr.length;

		for (int count = 1; count <= rot; count++) {
//			1 rotation ka logic!!
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
		}

	}
}
