package week06;

import java.util.Scanner;

public class NestedLoopsPractice {
    public static void main(String[] args) {



    }
    public static void one(){


    }
    public static void two(){
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        int total = 0;
        for (int i = 0; i <=number ; i++) {
            for (int j = 0; j <=number; j++) {
                for (int k = 0; k <= number ; k++) {
                    if (i+j+k==number){
                        System.out.println(""+i+j+k);
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
        input.close();


    }


}
