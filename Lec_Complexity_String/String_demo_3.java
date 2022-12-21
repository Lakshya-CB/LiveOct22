package Lec_Complexity_String;

public class String_demo_3 {
	public static void main(String[] args) {
//		Case 1 
		String str1 = "abcd";

		String str2 = "ab";

		String str3 = str1.substring(0, 2);
		String str4 = str3.intern();
		System.out.println(str3 == str2);
		System.out.println(str4 == str2);

	}
}
