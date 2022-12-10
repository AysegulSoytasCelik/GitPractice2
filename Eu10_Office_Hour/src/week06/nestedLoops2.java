package week06;

import java.beans.PropertyEditorSupport;

public class nestedLoops2 {

    public static void main(String[] args) {
        one();





    }
    public static void one(){
        int result =0;
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println((i+"x" +j+"=" +i*j));
            }


        }



    }



}
