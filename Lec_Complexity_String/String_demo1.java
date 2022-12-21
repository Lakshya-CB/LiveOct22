package Lec_Complexity_String;

public class String_demo1 {
	public static void main(String[] args) {
		String str1 = "alloo"; // literal!!
		String str2 = new String("alloo"); // new keyword!!
		
		System.out.println(str1==str2); // address!!
		System.out.println(str1.equals(str2)); // address!!
		
	}
}
