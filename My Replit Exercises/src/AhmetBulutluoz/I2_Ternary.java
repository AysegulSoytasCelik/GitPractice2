package AhmetBulutluoz;

import java.util.Scanner;

public class I2_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit number");

        int num =scan.nextInt();
        System.out.println(num%5==0? "this number can divide by 5 ":" cant divide by 5");

        System.out.println(" enter a letter");
        char ch= scan.next().charAt(0);

        System.out.println(ch<='a' && ch >='z'? (char) (ch-32):ch);


scan.close();

    }
}
