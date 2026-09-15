package org.example.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) +1;
        int guesses = 0;
        int input;
        System.out.print("Guess the number: ");
        do {
            input = scan.nextInt();
            guesses++;
            if (input < secret){
                System.out.print("Higher! Guess another number: ");
            } else if (input > secret) {
                System.out.print("Lower! Guess another number: ");
            }
        } while (input != secret);
        String Singleguess = guesses == 1 ? " guess." : " guesses.";
        System.out.println("Congrats you got it. You got it in " + guesses + Singleguess);

        scan.close();
    }
}
