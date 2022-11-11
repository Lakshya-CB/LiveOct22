package Lec_07;

public class data_types_01 {
	public static void main(String[] args) {
		byte b = (byte)128;
		System.out.println(b);
		
		short sh = -32768;
		System.out.println(sh);
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE);
		int i = 2147483647;
		System.out.println(i);

		long l = 21474;  // bits padding!! 0 +ve if 1 -ve
		System.out.println(l);
		
//		
		float f = (float)2.4;
		double d = 2.4;
		System.out.println("AAJAADI");
		
		System.out.println("=============");
		
		char ch = 'A';
		System.out.println((int)ch);
		
		System.out.println((char)(ch+25));
		
		int i1 = ch;
		System.out.println(i1);
		
		
		char ch1 = (char)(i+10);
		System.out.println(ch1); 
		
	}
}
