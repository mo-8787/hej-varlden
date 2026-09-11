package org.example;

import java.util.Scanner;

public class Raknare {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        double a = Scan.nextInt();
        System.out.print("Ange ett ytterligare tal: ");
        double b = Scan.nextInt();

        double kvot = (a / b);
        System.out.printf("Kvoten är %.2f%n" , kvot);
        Scan.close();

    }
}
