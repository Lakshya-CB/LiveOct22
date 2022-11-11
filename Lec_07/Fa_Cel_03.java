package Lec_07;

public class Fa_Cel_03 {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 20;
		for (int F = minF; F <= maxF; F = F + step) {
			int C = (int)(5 / 9.0 * (F - 32));
			System.out.println(F + "\t" + C);
		}
		boolean b = 1>3;
		System.out.println(b);
		b = false;
		
		System.out.println(b);
		System.out.println("========");
		if(b) {
			System.out.println("Nacho");
		}
		while(b) {
			System.out.println("-");
			
		}
			
	}
}
