package Lec_01;

import java.util.Scanner;

public class Odd_even_4 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	
	
	if(0 == num%2 ) {
		System.out.println("EVEN");
	}else {
		System.out.println("ODD");
	}
}
}
