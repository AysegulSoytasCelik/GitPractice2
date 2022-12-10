package AhmetBulutluoz;

import java.util.Scanner;

public class A2_ScannerRepetition2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("r to the circle");

        double r =scan.nextDouble();
        double area = 3.14 *r*r;
        System.out.println("area: "+area);
        scan.close();





    }
}
