package Lec_14;

public class Array_2D_demo {
	public static void main(String[] args) {
		int[][] mat = new int[5][3];
		System.out.println(mat);
		System.out.println(mat.length); // rows
		System.out.println(mat[0].length); // cols
		for (int[] row : mat) {
			System.out.println(row);
		}
		System.out.println("==============");
//		mat[0][0] = 2;
//		mat[0][1] = 4;
//		mat[0][2] = 6;
//
//		mat[1][0] = 8;
//		mat[1][1] = 10;
//		mat[1][2] = 12;
//
//		mat[2][0] = 10;
//		mat[2][1] = 12;
//		mat[2][2] = 14;

		int num = 2;
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				mat[row][col] = num;
				num = num + 2;
			}
		}
		System.out.println("==============");
//		System.out.println(mat[0][0]);
//		System.out.println(mat[0][1]);
//		System.out.println(mat[0][2]);
//		
//		System.out.println(mat[1][0]);
//		System.out.println(mat[2][1]);
//		System.out.println(mat[3][2]);

		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				System.out.print(mat[row][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("==============");
		for(int[] row : mat) {
//			System.out.println(row);
			for(int ali: row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}
}
