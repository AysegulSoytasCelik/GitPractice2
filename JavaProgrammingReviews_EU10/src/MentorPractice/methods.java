package MentorPractice;

public class methods {

    public static void main(String[] args) {

        String head= "shoulders"; String knees = "toes";

        String elbow = "head";

        String eye="eyes and ears";

        String ear= "eye";

        touch (ear, elbow);

        touch(elbow, ear);

        touch(head,"bani");

        touch(eye, eye);

        touch (knees,"Toes");

        touch (head,"knees " + knees);


    }

    private static void add10(int num) {
        num = num + 10;
    }




    public static void touch (String elbow, String ear) {

        System.out.println("touch you " + elbow+" to your " + ear);

    }
}
