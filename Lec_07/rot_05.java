package Lec_07;

public class rot_05 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 30000002;

		int nod = 0;
		int back_up = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = back_up;
		rot = rot % nod;

		int divisor = (int) Math.pow(10, rot);
		int P1 = num / divisor;
		int P2 = num % divisor;
		System.out.println(P1 + " " + P2);

		int mult = (int) Math.pow(10, nod - rot);

		System.out.println(mult * P2 + P1);
	}
}
