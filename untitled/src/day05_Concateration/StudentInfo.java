package day05_Concateration;

public class StudentInfo {
    /*
            2. Create a class called StudentInfo, and declare variables for the followings:
                    1. student name (String)
                    2. age (int)
                    3. gender (char)
                    4. school name (String)
                    5. phone number (String) (###)-###-####
                    6. full time (boolean)
             */
    public static void main(String[] args) {
        String studentName = "Aysegul";
        int age = 40;
        char gender = 'F';
        String schoolName = "Cydeo";
        String phoneNumber = "(123)-456-7891";
        boolean fullTime = true;
        double GPA = 2.5;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("fullTime = " + fullTime);
        System.out.println("GPA = " + GPA);



    }
}
