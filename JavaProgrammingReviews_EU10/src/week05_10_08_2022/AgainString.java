package week05_10_08_2022;

public class AgainString {
    public static void main(String[] args) {
        String sentence = "Java is a hard programming language";

        System.out.println(sentence.replace("a hard", "an easy"));
        //Java is a hard programming language//Java is an easy programming language

        System.out.println(sentence.replace("hard","fun"));

        String sentence1= "java is not same with Java";
        System.out.println(sentence1.replaceFirst("Java","C#"));






    }
}
