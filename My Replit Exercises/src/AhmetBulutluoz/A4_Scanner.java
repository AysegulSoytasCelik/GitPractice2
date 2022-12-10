package AhmetBulutluoz;

import java.util.Scanner;

public class A4_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        char letter =name.charAt(0);

        System.out.println("Enter your surname: ");
        String surname = scan.nextLine();

        System.out.println("Enter your age: ");
        int age =scan.nextInt();
        System.out.println("Entered :" +letter+" "+surname+" ,"+age);

scan.close();
    }
}
