package Lec_05;

public class Par_01 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		while (row <= n) {
//			print karo each row!!!!
			int cnt_st = 0;
			while(cnt_st<n) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			row++;
			System.out.println();
		}
	}
}
