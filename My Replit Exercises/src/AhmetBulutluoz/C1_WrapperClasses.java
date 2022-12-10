package AhmetBulutluoz;

import java.util.Scanner;

public class C1_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.toUpperCase());

        System.out.println("=======================================================");
        Scanner scan = new Scanner(System.in);
        // input number +all units

        System.out.println("enter a number which has 3 units");
        int num = scan.nextInt(); //for example 123
        int units = 0;
        int addAllDigits = 0;
        units = num % 10; //3
        addAllDigits = addAllDigits + units; //addAllDigits value was:0==> now==>0+3
        num = num / 10; // new number is 12

        units = num % 10; // 12/10==>2 new units
        addAllDigits = addAllDigits + units; // new addAllDigits value was 3==> now==>3+2=5

        units = num / 10; //result is 1==>last unit
        addAllDigits = addAllDigits + units;
        System.out.println(addAllDigits);
scan.close();
    }
}
