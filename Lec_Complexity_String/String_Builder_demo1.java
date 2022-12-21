package Lec_Complexity_String;

public class String_Builder_demo1 {
	public static void main(String[] args) {
		String str = new String("LOLIPOP");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(0, 3));

		System.out.println("============");

//		StringBuilder sb = new StringBuilder("LOLIPOP");
		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.substring(0, 3));
		System.out.println(sb.indexOf("O"));
		System.out.println(sb.lastIndexOf("O"));
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'O'); // O(1)
		System.out.println(sb);

		sb.append("asdas"); // O(1)
		System.out.println(sb);

		sb.insert(2, "zzzz"); // O(n) shifting
		System.out.println(sb);

		sb.deleteCharAt(2);// O(n)
		System.out.println(sb);

		String ans = sb.toString(); // return to string
		System.out.println(ans);

	}
}
