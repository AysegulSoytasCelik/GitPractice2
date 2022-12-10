package week06;

public class ForPractice {
    public static void main(String[] args) {

    }



    public static void practice5(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(9-i*2+1)+String.valueOf(i+1).repeat(i*2+1));
        }
    }

}
