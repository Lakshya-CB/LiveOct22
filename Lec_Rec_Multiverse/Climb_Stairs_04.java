package Lec_Rec_Multiverse;

public class Climb_Stairs_04 {
	
	public static void main(String[] args) {
		suvle(0, 3, "");
	}
// Permutation
	public static void suvle(int curr, int dest, String path) {
		if (curr > dest) {
//			-ve BC
			return;
		}
		if (curr == dest) {
			System.out.println(path);
			return;
		}

		suvle(curr + 1, dest, path + 1);
		suvle(curr + 2, dest, path + 2);
		suvle(curr + 3, dest, path + 3);

	}
}
