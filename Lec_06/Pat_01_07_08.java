package Lec_06;

public class Pat_01_07_08 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		while (row <= n) {
			int cnt_st = 0;
			while (cnt_st < n) {
//				if (cnt_st == 0 || cnt_st == n -1
//						|| row == n || row == 1) {
				if (row == cnt_st + 1 && row+cnt_st==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}

			row++;
			System.out.println();
		}
	}
}
