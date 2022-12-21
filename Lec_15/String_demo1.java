package Lec_15;

public class String_demo1 {
	public static void main(String[] args) {
		String str = "abcdbcebcfg"; // Immutable
		System.out.println(str.length());
		
		char ch = str.charAt(3);
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length()-1));
		
//		System.out.println(str.charAt(str.length()));
		
//		Index of => First Occurrence
		System.out.println(str.indexOf("bc"));
		System.out.println(str.indexOf("babbu"));
		
//		Last Occurrence
		System.out.println(str.lastIndexOf("BC"));
		
//		prefix
		System.out.println(str.startsWith("abc"));
//		suffic
		System.out.println(str.endsWith("fg"));
		
		str = "abcd";
		System.out.println(str.substring(1,3));
		
		System.out.println("======");
		for(int s = 0;s< str.length();s++) {
			for(int e = s+1;e<= str.length();e++) {
				System.out.println(str.substring(s,e));
			}
		}
		
		
		
	}
}
