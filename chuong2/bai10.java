package chuong2;

import java.util.Scanner;

public class bai10 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("nhap chieu dai");
		int chieuDai = sc.nextInt();
		System.out.println("nhap chieu rong");
		int chieuRong = sc.nextInt();
		//calculate
		int area = chieuDai * chieuRong;
		int peri = (chieuDai + chieuRong)*2;
		//display
		System.out.println("chu vi la: " + peri);
		System.out.println("dien tich la: " + area);
	}
}
