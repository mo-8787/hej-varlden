package org.example;

import java.util.Scanner;

public class VeckodagSwitch {
    public static void main(String[] args) {
        System.out.print("Välj en dag (1-7): ");
        Scanner Scan = new Scanner(System.in);
        int day = Scan.nextInt();
        String name = switch (day) {
            case 1 -> "måndag";
            case 2 -> "tisdag";
            case 3 -> "onsdag";
            case 4 -> "torsdag";
            case 5 -> "fredag";
            case 6 -> "lördag";
            case 7 -> "söndag";
            default -> "inte giltig.";
        };
        String vardag = switch (day) {
            case 1, 2, 3, 4, 5 -> "vardag";
            case 6, 7 -> "helgdag";
            default -> "inte giltig.";
        };
        System.out.println("Dagen är " + name +", en " + vardag);

    }
}
