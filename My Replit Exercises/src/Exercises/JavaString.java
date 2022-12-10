package Exercises;

public class JavaString {
    public static void main(String[] args) {
        String name = "JavaConceptOfTheDay".substring(4);

        System.out.println(name);

        System.out.println("1".concat("2").repeat(5).charAt(7));

        System.out.println("Java" == new String("Java"));

        if("string".toUpperCase().equals("STRING"))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }



    }
}
