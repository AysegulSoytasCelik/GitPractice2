package week02_09_17_2022;

import javax.management.StandardMBean;

public class VariablesInfo {
    public static void main(String[] args) {
        /*
        2 variables type
            1.primitive data types
                -numerical primitives
          -double>float>long>int>short>byte
          -boolean
          -char -> define char 'A' (single quote and letter)


            2.non primitive data types (we will go on deep)
            String --> define String in "Adam" (double quote and words)

            *how to declare variables?
            data type      variableName   = data;

            variable naming rules:
                .must be unique (inside the same block-method)
                .should be camelCase
                .we CAN NOT start with numbers
                .we CAN NOT use Java Reserved Words
                .special characters only 2 we can use => _ and $
                .make it readable and understandable

         */

        //dta type variableName = data;
        //we need to use byte because is it the smallest one but we can use int too
        int age = 34;
       // byte myByte = 129; we cant write this because max.127 we can use in byte daya

        short myShort = 12;
        long myLong = 1223434343434343L; //should put l or L

        double myDouble = 25.5;
        double myDouble1 = 25.0;

        float myFloat = 12.5f;

        long l= 20;
        int i = (int)l; //we have to say complier make l is int
        double d = l;

        System.out.println("---------------------------------------------------");

    /*
    addition


     */
       int firstNumber = 10;
       int secondNumber = 20;
       int sum = firstNumber + secondNumber;

        System.out.println(sum);

        System.out.println(firstNumber+ " + " +secondNumber+" = " +sum); // 10+20=30
        System.out.println(firstNumber+ " + " +secondNumber+" = "+(firstNumber+secondNumber));//10+20=30System.out.println(firstNumber+ " + "+secondNumber+" = " + firstNumber + secondNumber);
        System.out.println(firstNumber+" + "+secondNumber+" = "+firstNumber+secondNumber);
        // 10+20=1020 !!!!!

        System.out.println("------------------------------------------------------");
        int a= 30;
        String s = "30";
        System.out.println(s+a); //string + int ===>concatination
                                 // result is = 3030
        String res = s+a;
        String res2 = s + a;
        System.out.println(res2); //3030 again


    }


}
