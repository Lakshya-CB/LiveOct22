package Lec_09;

public class Arrays_demo_1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);

		System.out.println(arr.length);
//		indexing!! , get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

//		last element of the array
		System.out.println(arr[arr.length - 1]);
//		System.out.println(arr[5]);
//		ith index ?
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		System.out.println("=========");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============");
		int arr2[] = new int[10];
		System.out.println(arr2);
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = 3*(i+1);
		}
		
		int i = 0;
		for (; i < arr2.length; ) {
			System.out.print(arr2[i]+" ");
			i++;
		}
		System.out.println();
		
	}
}
