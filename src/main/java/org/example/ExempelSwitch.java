package org.example;

import java.util.Scanner;

public class ExempelSwitch {
    public static void main(String[] args) {
        System.out.print("Välj dag (1-7): ");
        Scanner Scan = new Scanner(System.in);
        int day = Scan.nextInt();
        String name = "";
        switch (day) {
            case 1: name ="monday";
            break;
            case 2: name ="tuesday";
                break;
            case 3: name ="wednesday";
                break;
            case 4: name ="thursday";
                break;
            case 5: name ="friday";
                break;
            case 6: name ="saturday";
                break;
            case 7: name ="sunday";
                break;
            default:
                System.out.println("Va!?");
        }
        System.out.println("Veckodag: " + name );
        Scan.close();

    }
}
