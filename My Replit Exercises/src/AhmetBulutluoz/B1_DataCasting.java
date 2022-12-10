package AhmetBulutluoz;

import java.util.Scanner;

public class B1_DataCasting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");

        char ch = scan.next().charAt(0);
        System.out.println(ch); // a (=97)

        System.out.println("characters one more " +(ch + 1)); //ch a, one more is b=98

        System.out.println("characters one more: "+ (char)(ch+1)); //b
        System.out.println("characters one more: "+ (char)(ch+2)); //c
        System.out.println("characters one more: "+ (char)(ch+3)); //d
        System.out.println("characters one more: "+ (char)(ch+4)); //e

    }
}
