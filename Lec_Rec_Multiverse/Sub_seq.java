package Lec_Rec_Multiverse;

public class Sub_seq {
	public static void main(String[] args) {
		Sseq("abc", "");
	}

	public static void Sseq(String str, String team) {
//	BP : n logo ki team , abc
//	SP : n-1 logo ki team , abc
		if(str.equals("")) {
			System.out.println("~~"+team);
			return;
		}
		
		char ch = str.charAt(0);
		String remain = str.substring(1); // bc
		Sseq(remain, team+ch); // Include
		Sseq(remain, team); // Exclude
		
		
	}
}
