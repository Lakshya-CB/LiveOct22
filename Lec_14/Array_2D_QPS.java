package Lec_14;

public class Array_2D_QPS {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 }, { 41, 42, 43 }, { 51, 52, 53 } };
		disp(arr);
		Spiral(arr);
	}

	public static void disp(int[][] mat) {
		for (int[] row : mat) {
//			System.out.println(row);
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
		System.out.println("==========");
	}

	public static void wavey(int[][] mat) {
		for (int col = 0; col < mat[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < mat.length; row++) {
					System.out.print(mat[row][col] + " ");
				}
			} else {
				for (int row = mat.length - 1; row >= 0; row--) {
					System.out.print(mat[row][col] + " ");
				}
			}
		}
	}

	public static void Spiral(int[][] mat) {
		int rs = 0;
		int re = mat.length - 1;
		int cs = 0;
		int ce = mat[0].length - 1;

		int cnt = 0;
		int max = mat.length * mat[0].length;
		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re && cnt < max; r++) {
				System.out.print(mat[r][cs] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = cs + 1; c <= ce && cnt < max; c++) {
				System.out.print(mat[re][c] + " ");
				cnt++;
			}
			System.out.println();

			for (int r = re - 1; r >= rs && cnt < max; r--) {
				System.out.print(mat[r][ce] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = ce - 1; c >= cs + 1 && cnt < max; c--) {
				System.out.print(mat[rs][c] + " ");
				cnt++;
			}
			System.out.println();

			rs++;
			re--;
			cs++;
			ce--;
		}
	}

	public static boolean find(int[][] mat, int ali) {
//	assume sorted row and col mat is gaben
		int r = 0;
		int c = mat[0].length - 1;

		while (r < mat.length && c >= 0) {
			if (ali < mat[r][c]) {
				c--;
			} else if (ali > mat[r][c]) {
				r++;
			} else {
				return true;
			}
		}
		return false;

	}
}
