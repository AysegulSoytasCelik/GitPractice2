package AhmetBulutluoz;

import java.util.Scanner;

public class A1_ScannerRepetition {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scan.next();
        //next() takes just first word up to space
scan.close();



    }
}
