package org.example;

import java.util.Scanner;

public class Tempkonvertering {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = Scan.nextDouble();

        //Formel: F = C * 9/5 + 32
        double fahrenheit = celsius * 9/5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.1f°C är %.1f°F och %.1f°K%n" , celsius, fahrenheit, kelvin);
    }
}
