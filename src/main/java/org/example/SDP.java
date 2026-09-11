package org.example;

import java.util.Scanner;

public class SDP {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = Scan.nextInt();
        System.out.print("Enter another number: ");
        int b = Scan.nextInt();

        int summa = (a + b);
        int differens = (a - b);
        int produkt = (a * b);

        System.out.println("Summan är: "+ summa + "\nDifferens är: "+ differens + "\nProdukten är: " + produkt);

        Scan.close();
    }
}
