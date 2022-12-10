package AhmetBulutluoz;

import java.util.Scanner;

public class J2_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case  4:
            System.out.println("thurs");
            break;

            case 5:
            System.out.println("fridy");
            break;

            case 6:
            System.out.println("strday");
            break;

            case 7:
            System.out.println("sundy");
            break;

            default:
                System.out.println("invalid nmber please enter between 1-7");
        }

scan.close();
    }
}
