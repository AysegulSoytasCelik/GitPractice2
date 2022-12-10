package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1_FindingHiddenNumbers {
    public static void main(String[] args) {
        // int hiddenNumber = 6;
        Random random=new Random();
        int hiddenNumber = random.nextInt(10)+1;

        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do{
            System.out.println("enter a number");
            int searchedNumber= scanner.nextInt();
            if (searchedNumber==hiddenNumber){
                System.out.println("you find the number, Cograts");
                flag = false;
            }else{
                System.out.println("try again!");
            }
        }while (flag);








    }
}
