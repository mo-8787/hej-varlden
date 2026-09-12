package org.example;

import java.util.Scanner;

public class Pricewithmoms {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("What is the price excluding moms?: ");
        double excl = Scan.nextDouble();
        double incl = (excl * 1.25);
        System.out.printf("Price excl. moms: %.2f%nPrice incl. moms: %.2f%n" ,excl, incl);
    }
}
