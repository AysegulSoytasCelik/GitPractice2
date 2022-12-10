package week05_10_08_2022;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";
        //0123456789....
        System.out.println(sentence.indexOf("programming")); // return 0

        String sentence2 = "Java is Java";
        System.out.println(sentence2.indexOf("Java"));
        System.out.println(sentence2.lastIndexOf("Java")); //return 8

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner scanner = new Scanner(System.in);

        String word = "Hello";
        System.out.println("enter a word: ");
        String result=""+ word.charAt(0)+word.charAt(1);
        System.out.println(result.toUpperCase());


    }
}
