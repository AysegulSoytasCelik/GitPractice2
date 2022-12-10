package week06;

public class whileLoop {


    public static void main(String[] args) {
        three();
        four();

    }

    public static void three() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.println(" " + i);
            i++;
        } while (i < 11);
    }

    public static void four() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }


    }




}
