package AhmetBulutluoz;

public class D4_Pre_Post {
    public static void main(String[] args) {
        int a =10;
        System.out.println("a= "+ ++a); // a= 11

        int b= a++; //b=11, a=12
        System.out.println("b= "+b); //b=11

        int c = b++ + a; // a= 12, b=11
        System.out.println("c= "+c); // c=23
        System.out.println("result= " +(a+b+c)); //a=12, b=12, c=23 ==>47






    }
}
