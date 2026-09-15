package org.example.loops;

import java.util.Random;
import java.util.Scanner;

public class MenyLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;

        while (running) {
            System.out.println("=== Meny ===");
            System.out.println("1.Hälsa   2.Räkna BMI   3.Slumpa tal   4.Avsluta");
            System.out.print("Välj: ");
            int option =scan.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Vad heter du? ");
                    String name = scan.nextLine();
                    System.out.println("Hej " + scan.nextLine() + "!");
                }
                case 2 -> { System.out.print("Vad är din vikt?: ");
                    double vikt = scan.nextDouble();
                    System.out.print("Vad är din längd i meter?: ");
                    double längd = scan.nextDouble();
                    double BMI = vikt / (längd * längd);
                    System.out.printf("Din BMI är %.1f.%n " , BMI);
                }
                case 3 -> System.out.println(rand.nextInt(100) + 1);
                case 4 -> { System.out.println("Hej då!"); running = false;}
                default -> System.out.println("Ogiltigt val. Försök igen.");
            }
        }
        scan.close();
    }

}
