package Lec_06;

public class Pat_num {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;

		int in_ntp = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("\t");
				cnt_sp++;
			}
			int ntp = in_ntp;
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print(ntp + "\t");
				cnt_st++;
				
				if (cnt_st <= total_st / 2) {
					ntp++;
				} else {
					ntp--;
				}
			}

			total_st = total_st + 2;
			total_sp--;
			row++;

			System.out.println();
		}
	}
}
