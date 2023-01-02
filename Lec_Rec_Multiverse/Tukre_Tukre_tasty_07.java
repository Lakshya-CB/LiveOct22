package Lec_Rec_Multiverse;

public class Tukre_Tukre_tasty_07 {
	public static void main(String[] args) {
		kaat_dal("nitin", "");
	}

	public static void kaat_dal(String table, String bag) {
		if (table.isEmpty()) {// +ve BC?!
			System.out.println(bag);

		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isTasty(piece)) {
				String remain = table.substring(chakku);
//			System.out.println(piece+ " = "+remain);
				kaat_dal(remain, bag + "--" + piece);
			}
		}
	}

	public static boolean isTasty(String piece) {
		int s =0;int e = piece.length()-1;
		while(s<e) {
			if(piece.charAt(s)!=piece.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
}
