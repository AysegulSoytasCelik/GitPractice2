package AhmetBulutluoz;

import java.util.Scanner;

public class B2_DataCasting {
    public static void main(String[] args) {
        //take 2 numbers to the user and divide them and write the result as double

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int a =scan.nextInt();

        System.out.println("Enter second number which is divide by:");
        int b=scan.nextInt();
double c = (double)a/b;

        System.out.println("result is: " + c);

scan.close();


    }
}
