package AhmetBulutluoz;

import java.util.Scanner;

public class H1_IfElseRetired {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter your gender:male/female");
        String gender= scan.nextLine();
        System.out.println("enter your age:");
        int age = scan.nextInt();

        if (age>90 || age<0){
            System.out.println("invalid age");
        } else if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.println("invalid gender");
        } else if (gender.equalsIgnoreCase("female")&& age>60) {
            System.out.println("eligible to retire");

        } else if (gender.equalsIgnoreCase("female")&& age<60) {
            System.out.println("need to work " +(60-age) +" more years" );


        } else if (gender.equalsIgnoreCase("male")&&age>65) {
            System.out.println("eligible to retire");

        } else if (gender.equalsIgnoreCase("male")&&age<65) {
            System.out.println("need to wprk "+(65-age)+" more years");

        }


    }
}
