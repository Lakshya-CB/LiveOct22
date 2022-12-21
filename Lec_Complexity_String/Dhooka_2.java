package Lec_Complexity_String;

public class Dhooka_2 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1;
		str1 = str1+"P";  // creates a new String at a new address!!
		System.out.println(str2);
		System.out.println(str1);
		
	}
}
