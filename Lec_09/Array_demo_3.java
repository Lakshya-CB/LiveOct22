package Lec_09;

public class Array_demo_3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 3 * (i + 1);
		}
//		enhanced loop ya for each loop
//		read only
		for (int ali : arr) {
//			System.out.println(ali);
			ali = 99;
		}
		
		for (int ali : arr) {
			System.out.println(ali);
		}
	}
}
