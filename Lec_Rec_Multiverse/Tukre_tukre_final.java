package Lec_Rec_Multiverse;

import java.util.ArrayList;
import java.util.List;

public class Tukre_tukre_final {
	public List<List<String>> partition(String s) {
        List<List<String>> Big_AL = new ArrayList<>();
        kaat_dal(s,"",new ArrayList<>(),Big_AL);
        
        return Big_AL;
    }
    public static void kaat_dal(String table, String bag, List<String> AL,List<List<String>> Big_AL) {
		if (table.isEmpty()) {// +ve BC?!
            List<String> ans = new ArrayList<>(AL);
            Big_AL.add(ans);
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if(isTasty(piece)){
                String remain = table.substring(chakku);
                AL.add(piece);// prep for the next recursive call
                kaat_dal(remain, bag + "||" + piece, AL,Big_AL);
                AL.remove(AL.size()-1); // undoing the prep!! - explicit backtracking!!
            }
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
