package org.example;

import java.util.Scanner;

public class Raknare {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        int a = Scan.nextInt();
        System.out.print("Ange ett ytterligare tal: ");
        int b = Scan.nextInt();
        System.out.println("Kvoten är: " + (a / b));

    }
}
