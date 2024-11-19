/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai7 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Nhap so thuc
        System.out.print("Nhap so thuc a: ");
        float a = input.nextFloat();
        System.out.print("Nhap so thuc b: ");
        float b = input.nextFloat();
        //list ra cac choice
        System.out.println("------------------------");
        System.out.println("A. Tinh tong 2 so");
        System.out.println("S. Tinh hieu 2 so");
        System.out.println("M. Tinh tich 2 so");
        System.out.println("D. Tinh thuong 2 so");
        System.out.println("------------------------");

        boolean check = false;

        while (!check) {
            //Nhap vao ki tu
            System.out.print("Nhap ki tu: ");
            char c = input.next().charAt(0);
            
            switch (c) {
                case 'A' -> {
                    System.out.println("Tong 2 so: " + (a + b));
                    check = true;
                }
                case 'S' -> {
                    System.out.println("Hieu 2 so: " + (a - b));
                    check = true;
                }
                case 'M' -> {
                    System.out.println("Tich 2 so: " + (a * b));
                    check = true;
                }
                case 'D' -> {
                    System.out.println("Thuong 2 so: " + (a / b));
                    check = true;
                }
                default -> System.out.println("Ky tu khong hop le!");
            }
        }
    }
}
