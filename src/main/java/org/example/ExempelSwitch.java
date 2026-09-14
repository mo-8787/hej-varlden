package org.example;

import java.util.Scanner;

public class ExempelSwitch {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String a = "Hej";
        System.out.print("Skriv \"Hej\": " );
        String userInput = Scan.nextLine();
        if(userInput.equalsIgnoreCase(a)){
            System.out.println("Du skriver oerhört rätt!");
        }
        else System.out.println("Nu skrev du fel. ");




        Scan.close();

    }
}
