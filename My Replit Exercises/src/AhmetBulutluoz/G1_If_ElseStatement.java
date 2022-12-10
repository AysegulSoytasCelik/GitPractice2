package AhmetBulutluoz;

import java.util.Scanner;

public class G1_If_ElseStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("give three variable and  press enterafter each variable ");

        double n1=scan.nextDouble();
        double  n2=scan.nextDouble();
        double n3= scan.nextDouble();

        if (n1==n2 && n2==n3){
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("eskenar ucgen degil");

        }
scan.close();





    }
}
