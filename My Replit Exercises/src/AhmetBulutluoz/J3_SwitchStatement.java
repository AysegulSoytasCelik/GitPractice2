package AhmetBulutluoz;

import java.util.Scanner;

public class J3_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = scan.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;

            default:
                System.out.println("invalid nmber please enter between 1-7");

scan.close();
        }
    }

}