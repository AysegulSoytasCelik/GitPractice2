package AhmetBulutluoz;

import java.util.Scanner;

public class F2_IfStatement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num =scan.nextInt();

        if (num %3==0){
            System.out.println("This number can divide by 3");
        }
        if (num %5 ==0){
            System.out.println("This number can divide by 5");
        }

scan.close();


    }
}
