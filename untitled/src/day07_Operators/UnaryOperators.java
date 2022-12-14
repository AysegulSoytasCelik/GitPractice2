package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25; //this number is a positive number but we never put +
        int num2 = -25;
        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true


        System.out.println("--------------------------------------------------------");
        int a = 5;
        ++a; //pre incremenet : increases the value by 1 right away

        System.out.println(a);
        --a; // pre decrement: decreases the value by 1 right away

        System.out.println(a);

        System.out.println("------------------------------------------------------------");
        int b = 100;
        System.out.println(++b);//pre increment;increase the value by 1 right away
        int c = 100;

        System.out.println(c++); //post increment 100: first passes the current value,
                                 //then increases the value by 1
        System.out.println(c);
        System.out.println("-----------------------------------------");
        int x =200;
        System.out.println(--x); //199
        int y = 200;
        System.out.println(y--); //post decrement: first passes the current value, then decrease....
        System.out.println(y); //199 ???

        System.out.println("---------------------------------------------");
        int z =45;
        System.out.println(++z); //46, z=46
        System.out.println(z++); //46, z=47
        System.out.println(z); //47

        int q = 30;
        System.out.println(--q); //29 q=29
        System.out.println(q--); // 29, q=28
        System.out.println(q); //q=28

    }
}
