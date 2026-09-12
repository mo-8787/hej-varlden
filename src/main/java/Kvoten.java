import java.util.Scanner;

public class Kvoten {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Ange en täljare: ");
        double a = Scan.nextInt();
        System.out.print("Ange en nämnare: ");
        double b = Scan.nextInt();
        double kvot = (a / b);

        System.out.printf((int)a + "/" + (int)b + " = " + kvot);
    }
}
