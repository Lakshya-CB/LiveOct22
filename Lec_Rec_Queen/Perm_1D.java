package Lec_Rec_Queen;

public class Perm_1D {
	public static void main(String[] args) {
		int total = 4;
		boolean[] seats = new boolean[total];
		solve(2, "", seats, total);
	}

	public static void solve(int QTP, String path, boolean[] seats, int total) {
		if (QTP == 0) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < total; i++) {
			if (seats[i] == false) {
				seats[i] = true; // prep kari hein
				solve(QTP - 1, path + "Q" + i, seats, total);
				seats[i] = false; // undo karna hein!!
			}
		}
	}
}
