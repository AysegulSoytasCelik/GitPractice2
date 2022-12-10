package WithMentor;

public class Unary {
    public static void main(String[] args) {

        int a =1;
        a= -a-- + a++ / -a-- + --a;
        System.out.println("a= " +a);
        //----------------------------------------------------------

int x= 50;
x = --x + x++ + x-- + x;
// 49 + 49 + 50 + 59 = 197
        System.out.println("x= " + x);










    }
}
