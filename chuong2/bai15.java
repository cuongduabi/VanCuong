package chuong2;
import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Nhp vao so ngay luu tru: ");
        int day = sc.nextInt();
        System.out.println("Nhap vao don gia ngay cua nha nghi: ");
        double price = sc.nextDouble();

        //init 1 variable tong tien thanh toan
        double result = 0;
        //calculate
        if(day == 1) {
            result = price;
        }
        else if(day >= 2 && day <= 4) {
            result = (price * day) * (80 / 100); //giam 20%
        }
        else if(day >= 5 && day <= 10) {
            result = (price * day) * (60 / 100); //giam 40%
        }
        else if(day >= 11) {
            result = (price * day) * (40 / 100); //giam 60%
        }
        //ouput
        System.out.println("Tien phong phai thanh toan trong " + day + " ngay la: " + result);
    }
}
