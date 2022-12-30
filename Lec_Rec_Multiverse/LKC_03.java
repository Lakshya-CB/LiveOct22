package Lec_Rec_Multiverse;

public class LKC_03 {
	public static void main(String[] args) {
		duvle("23", "");
	}
	public static void duvle(String buttons, String path) {
		if(buttons.isEmpty()) {
			System.out.println(path);
			return;
		}
//		BP : buttons "234",""
//		SP : buttons "34",""
		
		String remain = buttons.substring(1); //34
		char ch = buttons.charAt(0); // 2
		
		String op = options(ch);
		for(int i=0;i<op.length();i++) {
			duvle(remain, path+op.charAt(i));
		}
		
		
	}
	public static String options(char ch) {
		if(ch=='2') {
			return "abc";
		}else if(ch=='3') {
			return "def";
		}else if(ch=='4') {
			return "ghi";
		}else if(ch=='5') {
			return "jkl";
		}else if(ch=='6') {
			return "mno";
		}else if(ch=='7') {
			return "pqrs";
		}else if(ch=='8') {
			return "tuv";
		}else if(ch=='9') {
			return "wxyz";
		}else {
			return "";
		}
	}
}
