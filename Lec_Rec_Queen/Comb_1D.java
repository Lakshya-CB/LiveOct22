package Lec_Rec_Queen;

public class Comb_1D {
	public static void main(String[] args) {
//		suvle_wrt_Queen(-1, 2, "", 4);
		suvle_wrt_seat(0, 2, "", 4);
	}

	public static void suvle_wrt_Queen(int prev, int QTP, String path, int total_seats) {
		if (QTP == 0) {
			System.out.println(path);
			return;
		}
//		QTP place karo
//		QTP-1 place karo
//		1 Queen will be placed
		for (int idx = prev + 1; idx < total_seats; idx++) {
//			place the queen at seat idx!!
			suvle_wrt_Queen(idx, QTP - 1, path + "Q" + idx, total_seats);
		}
	}

	public static void suvle_wrt_seat(int curr, int QTP, String path, int total_seat) {
//	BP : n seats
//	SP : n-1 seats
//	1 seat!!
		if (QTP == 0) {// +ve BC
			System.out.println(path);
			return;
		}
		if (curr == total_seat) { // -ve BC
			return;
		}

		suvle_wrt_seat(curr + 1, QTP - 1, path + "Q" + curr, total_seat); // Include
		suvle_wrt_seat(curr + 1, QTP, path, total_seat); // Exclude

	}
}
