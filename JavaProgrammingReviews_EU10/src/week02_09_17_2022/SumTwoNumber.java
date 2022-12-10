package week02_09_17_2022;

public class SumTwoNumber {

    public static void main(String[] args) {
        /*

         */
        //declare first variable
        int firstNumber = 10;
        //declare the second variable
        int secondNumber = 20;
        //adding two variables and assign in another variable
        int sum = firstNumber + secondNumber;
        //print the result

        //System.out.println(sum);
        System.out.println(sum);
        System.out.println("sum = " + sum);

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber+secondNumber);
    //it's wrong sum ==> 10+20=1020 (this is not what i want)

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber) );

        int a = 30;
        String s = "30"; //string+int ==> concatenation
        System.out.println(s+a); //it makes ==> 3030

        String res = s+ a;
        String s1 = s + a;
        String s2 = s + a;











    }
}
