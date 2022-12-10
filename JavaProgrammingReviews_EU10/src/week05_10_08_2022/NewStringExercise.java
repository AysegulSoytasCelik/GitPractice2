package week05_10_08_2022;

public class NewStringExercise {
    public static void main(String[] args) {

        String word = "Hello";
        int indexOfLastChar = word.length()-1; //index of o

        int indexOfSecondChar =word.length()-2; //index of l

        char last = word.charAt(indexOfLastChar);
        char beforeLast = word.charAt(indexOfSecondChar);

        String lastTwo= ""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);





    }
}
