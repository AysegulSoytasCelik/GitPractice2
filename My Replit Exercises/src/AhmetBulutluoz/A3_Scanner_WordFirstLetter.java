package AhmetBulutluoz;

import java.util.Scanner;

public class A3_Scanner_WordFirstLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        char firstLetter = scan.next().charAt(0); //because we want to write first letter
        System.out.println("First letter to the scanner word: " + firstLetter);

scan.close();







    }
}
