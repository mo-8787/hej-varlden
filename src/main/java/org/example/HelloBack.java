package org.example;

import java.util.Scanner;

public class HelloBack {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = Scan.nextLine();
        System.out.println("Hi " + name);

        Scan.close();

    }
}
