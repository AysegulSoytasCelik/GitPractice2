package AhmetBulutluoz;

import java.util.Scanner;

public class J1_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = scan.nextInt();

        if (num<0 || num>7){
            System.out.println("invalid nmber please enter between 1-7");
        } else if (num==1) {
            System.out.println("mon");
        } else if (num==2) {
            System.out.println("tues");
        } else if (num==3) {
            System.out.println("wed");
        } else if (num==4) {
            System.out.println("thurs");
        } else if (num==5) {
            System.out.println("fridy");
        }else if (num ==6){
            System.out.println("strday");
        }else{
            System.out.println("sundy");
        }

scan.close();
    }
}
