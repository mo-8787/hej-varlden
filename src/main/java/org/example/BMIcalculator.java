package org.example;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = Scan.nextLine();

        System.out.print("Please enter your weight: ");
        double weight = Scan.nextDouble();

        System.out.print("Please enter your height: ");
        double height = Scan.nextDouble();

        // BMI = weight / (height * height)
        double BMI = weight / (height * height);

        System.out.printf("Hi %s, your BMI is %.1f%n" , name, BMI);

        Scan.close();

    }
}
