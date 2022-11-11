package Lec_03;

public class Print_series_01 {
	public static void main(String[] args) {
		int N1 = 10;
		int N2 = 4;

		int n = 1;
		int count = 1;
		while (count<=N1) {
			int temp = 3 * n + 2;
			n++;
			if (temp % N2 != 0) {
				System.out.println(temp);
				count++;
			}
		}
	}
}
