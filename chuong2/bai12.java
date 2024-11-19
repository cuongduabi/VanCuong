package chuong2;

import java.util.Scanner;

public class bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		System.out.print("nhap so diem: ");
		int score = sc.nextInt();
		//init 1 char empty
		char result = ' ';
		//analyze cac condition
		if (score < 50) {
			result = 'F';
		} else if (score >= 50 && score < 70) {
			result = 'D';
		} else if (score >= 70 && score < 80) {
			result = 'C';
		} else if (score >= 80 && score < 90) {
			result = 'B';
		} else if (score >= 90 && score <= 100) {
			result = 'A';
		} else {
			System.out.println("so diem ko hop le");
		}
		//output
		System.out.println(result);
	}
}
