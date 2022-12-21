package Lec_15;

public class String_QPS {
	public static void main(String[] args) {
//		String str = "the sky is blue";
//		RevWord(str);
//		String str = "abcdcba";
//		System.out.println(isPalin(str));

		String str = "aaaaa";
//		palinSS(str);
		palinSS2(str);

	}

	public static void RevWord(String str) {
		while (true) {
			int i = str.lastIndexOf(" ");
//		String word = str.substring(i+1,str.length());
			String word = str.substring(i + 1);
			System.out.println(word);
			if (i == -1) {
				break;
			}
			str = str.substring(0, i);
		}
	}

	public static void printAllSubString(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				System.out.println(str.substring(s, e));
			}
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) == str.charAt(e)) {
				s++;
				e--;
			} else {
				return false;
			}
		}
		return true;

	}

	public static void palinSS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void palinSS2(String str) {

		for (int i = 0; i < str.length(); i++) {
			fn(str, i, i); // Odd length
			fn(str, i, i+1); // Even length
		}
	}

	public static void fn(String str, int L, int R) {

		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
//				Left to right is a palindromic substring
				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				break;
			}
		}
	}
}
