package week05;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
     //count 1-10

        for (int i = 0; i < 11; i++) {
            System.out.print(i+" ");
        }
        System.out.println("-------------------------------------------");
        //write a programme to calculate the sum of first 10 natural numbers

        int sum =0;
        for (int i = 1; i <=10; i++) {
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("------------------------------------------------------------");

        //write a program that promptr the user to input a positive integer
        //it should then print the multiplication table of that number

        Scanner scan=new Scanner(System.in);
        System.out.println("Write a positive number");

        int num =scan.nextInt();
        for (int i = 1; i <=num ; i++) {

            System.out.println(num+ " x"+ i+"="+num*i);

        }
scan.close();


        String result="";
        for (int i = 1; i <=5; i++) {
            result+="*";
            System.out.println(result);
            //or
            //   System.out.println("*".repeat(i));
        }

    }

}
