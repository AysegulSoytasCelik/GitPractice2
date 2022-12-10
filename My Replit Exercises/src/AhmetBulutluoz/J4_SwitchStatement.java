package AhmetBulutluoz;

import java.util.Scanner;

public class J4_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number for month");
        int month = scan.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");

            default:
                System.out.println("invalid nmber please enter between 1-12");

scan.close();
        }


        }
}
