package AhmetBulutluoz;

import java.util.Scanner;

public class G3_If_ElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write your weight: ");
        double kg= scan.nextDouble();

        System.out.println("Write your height");
        double cm = scan.nextDouble();

        double hKg= kg*1000/(cm*cm);

        if (hKg>=30){
            System.out.println("obez");
        } else if (hKg>=25) {
            System.out.println("kilolu");
        } else if (hKg>=20) {
            System.out.println("normsl");
        }else {
            System.out.println("zayif");
        }
scan.close();
        }


    }
