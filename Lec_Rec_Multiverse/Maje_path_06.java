package Lec_Rec_Multiverse;

public class Maje_path_06 {
	public static void main(String[] args) {
		chalo(0, 0, "", 2, 2);
	}
	public static void chalo(int r, int c, String path, 
			int dest_r, int dest_c) {
		if(r>dest_r || c> dest_c) {
			return; // -ve BC
		}
		if(dest_r==r && dest_c==c) {
			System.out.println(path);
			return;
		}
		chalo(r, c+1, path+"R", dest_r, dest_c);
		chalo(r+1, c, path+"D", dest_r, dest_c);
		
	}
}
