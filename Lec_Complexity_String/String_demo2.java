package Lec_Complexity_String;

public class String_demo2 {
	public static void main(String[] args) {
		String s1 = "hello"; // Internpool!!
		String s2 = s1;
		String s3 = "hello";
		String s4 = new String("hello");
		s4 = "hello";
				

		System.out.println((s1 == s2) + " : " + s1.equals(s2));
		System.out.println((s1 == s3) + " :  " + s1.equals(s3));
		System.out.println((s1 == s4) + "  : " + s1.equals(s4));

	}
}
