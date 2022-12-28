package Lec_Rec_Array;

public class Array_recursion {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		printRev(arr, 0);
	}

	public static void Print(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP : Print(arr,idx)
//		SP : Print(arr,idx+1)
		System.out.println(arr[idx]);
		Print(arr, idx + 1);
	}

	public static void printRev(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP : (arr,0)
//		SP : arr,1

		printRev(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static void printRev1(int[] arr, int e) {
		if (e < 0) {
			return;
		}
//		BP : (arr,e)
//		SP : arr,e-1

		System.out.println(arr[e]);
		printRev1(arr, e - 1);
	}

	public static int Max(int[] arr, int idx) {
//		if(idx==arr.length-1) {
//			return arr[idx];
//		}
		if (idx == arr.length) {
			return Integer.MIN_VALUE;
		}
//		BP : Max(arr,0)
//		SP : Max(arr,1)
		int sp = Max(arr, idx + 1);
		if (sp > arr[idx]) {
			return sp;
		} else {
			return arr[idx];
		}

	}

	public static int First(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
//		BP : FI(arr,0,ali);
//		SP : FI(arr,1,ali);

		
		if (arr[s] == ali) {
			return s;
		}
//		int sp = First(arr, s + 1, ali);
		return  First(arr, s + 1, ali);
	}

	public static int Last(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
//		BP : FI(arr,0,ali);
//		SP : FI(arr,1,ali);

		int sp = Last(arr, s + 1, ali);
		if (sp == -1 && arr[s] == ali) {
			return s;
		}
		return sp;
	}
}
