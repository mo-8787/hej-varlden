package org.example;

public class yttreloop {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                System.out.print(row * col + "\t");

            }
            System.out.println();
        }
    }
}
