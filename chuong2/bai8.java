package chuong2;

public class bai8 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("tong cac so chan tu 1 den 100 la: " + sum);
	}
}
