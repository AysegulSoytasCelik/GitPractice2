package week02;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        String name = "Mike";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name");

        String nameUser = scan.nextLine();
        System.out.println("nameUser=" + nameUser);

        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("age=" + age);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your browser name:");
        String browserType = scanner.nextLine();

        switch (browserType) {
            case "firefox":
                System.out.println("Firefox is being setup");
                break;
            case "chrome":
                System.out.println("chrome is being setup");
                break;
            case "edge":
                System.out.println("edge is being setup");
                break;
            default:
                System.out.println("please enter a valid browser name");

        }
        scanner.close();
    }
}
