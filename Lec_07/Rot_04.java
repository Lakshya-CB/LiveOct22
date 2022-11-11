package Lec_07;

public class Rot_04 {
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

//		System.out.println(nod);
		for (int i = 0; i < rot; i++) {

			int digit = num % 10;
			int remain = num / 10;
//			System.out.println(digit + "  " + remain);
			int mult = (int) Math.pow(10, nod - 1);
			num = digit * mult + remain;

		}
		System.out.println(num);

	}
}
