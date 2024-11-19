package chuong2;
import java.util.Scanner;

public class bai11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("nhap ban kinh:");
		int bk = sc.nextInt();
		//calculate
		double dienTich = Math.PI * Math.pow(bk, 2);
		double chuVi = 2 * Math.PI * bk;
		//display
		System.out.println("dien tich la: "+dienTich);
		System.out.println("chu vi la: "+chuVi);
		
	}
}
