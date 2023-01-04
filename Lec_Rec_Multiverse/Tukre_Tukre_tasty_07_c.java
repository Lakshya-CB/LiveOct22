package Lec_Rec_Multiverse;

import java.util.ArrayList;
import java.util.List;

public class Tukre_Tukre_tasty_07_c {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		kaat_dal("ab", "", AL);
//		System.out.println(AL);
	}

	public static void kaat_dal(String table, String bag, List<String> AL) {
		if (table.isEmpty()) {// +ve BC?!
			System.out.println(bag);
			System.out.println(AL);
			System.out.println("===============");
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);		
			String remain = table.substring(chakku);
//			making a new AL like concatination of bag 
//			concatination of bag => creates a new String?!?!
//			Why?! because strings are immutable!!
			
			List<String> AL_copy = new ArrayList<>(AL);
			AL_copy.add(piece);
			kaat_dal(remain, bag + "||" + piece, AL_copy);

		}
	}

	public static boolean isTasty(String piece) {
		int s = 0;
		int e = piece.length() - 1;
		while (s < e) {
			if (piece.charAt(s) != piece.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
