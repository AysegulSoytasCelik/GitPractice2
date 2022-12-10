package AhmetBulutluoz;

import java.util.Scanner;

public class G2_If_Else_Ifstatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");

        int score =scan.nextInt();
        if (score>=85){
            System.out.println("AA");
        } else if (score>=65) {
            System.out.println("BB");
        } else if (score>=50) {
            System.out.println("CC");
        }else {
            System.out.println("DD");
        }

scan.close();
    }
}
