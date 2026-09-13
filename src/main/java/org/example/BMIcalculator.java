package org.example;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = Scan.nextLine();

        System.out.print("Please enter your weight(kg): ");
        double weight = Scan.nextDouble();
        Scan.nextLine();

        System.out.print("Please enter your height(cm): ");
        double heightCm = Scan.nextDouble();
        Scan.nextLine();

        double heightMeters = heightCm / 100.0;

        // BMI = weight / (height * height)
        double BMI = weight / (heightMeters * heightMeters);

        System.out.printf("Hi %s, your BMI is %.1f%n" , name, BMI);

        System.out.println("A healthy BMI is between 18.5 and 25.");

        if (BMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (BMI < 25) {
            System.out.println("You are normal weight.");
        } else if (BMI < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        Scan.close();

    }
}
