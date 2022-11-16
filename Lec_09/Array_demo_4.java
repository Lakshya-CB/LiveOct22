package Lec_09;

public class Array_demo_4 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = arr1;
		
		arr2[0] = 99;
		System.out.println(arr1[0]);
		
		
		
	}
}
