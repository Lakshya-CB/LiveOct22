package Lec_01;

public class ReportCard_5 {
	public static void main(String[] args) {
		int marks = 62;

		if (marks >= 90) {
			System.out.println("A");
		} else if (70 <= marks && marks < 80) {
			System.out.println("C");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("E");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("D");
		} else {
			System.out.println("Fail");
		}
	}
}
