package Lec_07;

import java.util.Scanner;

public class Lower_Uper_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		System.out.println(ch);
		if(ch>='A' && ch<='Z') {
			System.out.println("Upper");
		}else if(ch>='a' && ch<= 'z') {
			System.out.println("Lower");
		}else {
			System.out.println("???");
		}
	}
}
