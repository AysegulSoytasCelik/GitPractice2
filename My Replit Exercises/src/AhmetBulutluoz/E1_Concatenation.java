package AhmetBulutluoz;

public class E1_Concatenation {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(a + " " + b); //Hello World
        //String+String==> Concatenation=write them together

        System.out.println("===========================================================");

        int x = 10;
        int y = 20;
        System.out.println("result is: " + (x + y)); //result is: 30
//this is a concatenation too. String+()
        System.out.println(x + " and " + y + " additions result is: " + x + y);
        // 10 and 20 additions result is: 1020==> if you write(x+y) it will be correct but now not

        String a1 = "Hello";
        int b1 = 2;
        int c1 = 3;

        System.out.println("a1+b1+c1"); //Hello23
        System.out.println(c1+b1+a1); //5Hello
        System.out.println(a1+(b1+c1)); //Hello5
        System.out.println(a1+b1*c1); //Hello6


    }
}
