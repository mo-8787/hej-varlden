package org.example;

import java.util.Scanner;

public class Resten {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = Scan.nextInt();
        System.out.print("Enter another number: ");
        int b = Scan.nextInt();
        int rest = (a % b);
        System.out.println("Resten är: "+ rest);
    }
}
