package Lec_11;

public class Subarrays {
	public static void main(String[] args) {
		int[] arr = { -10, -20, -5, -30, -5000, -500, -600, -909999, -20 };
//		PrintAll(arr);
//		PrintAll2(arr);
		Kadance(arr);

	}

	public static void PrintAll(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " - " + e);
//				s to e
				int sum = 0;
				for (int i = s; i <= e; i++) {
					sum = sum + arr[i];
//					System.out.print(arr[i] + " ");
				}
//				System.out.println("=>" + sum);
//				ans = Math.max(ans,sum);
				if (ans < sum) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}

	public static void PrintAll2(int[] arr) {
		int ans = Integer.MIN_VALUE;
		// int sum = 0; // A
		for (int s = 0; s < arr.length; s++) {
			int sum = 0; // B
			for (int e = s; e < arr.length; e++) {
				// int sum = 0; // C
				sum = sum + arr[e];
				System.out.println("=>" + sum);

				ans = Math.max(ans, sum);
			}

		}
		System.out.println(ans);
	}

	public static void Kadance(int[] arr) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int ali : arr) {
			sum = sum + ali;

			
			ans = Math.max(sum, ans);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(ans);
	}
}
