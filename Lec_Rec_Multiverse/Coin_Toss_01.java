package Lec_Rec_Multiverse;

public class Coin_Toss_01 {
	public static void main(String[] args) {
		CT(3, "");
	}

	public static void CT(int n, String path) {
//	BP : n, ""
//	SP : n-1 , "H" "T"
		if(n==0) {
			System.out.println(path);
			return;
		}
		CT(n-1, path+"H"); // Heads
		CT(n-1, path+"T"); // Tails
	}	
}
