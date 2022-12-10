package AhmetBulutluoz;

public class D2_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        int num = 10;
        int b = num;
        num++;

        int c = num++; //post increment

        System.out.println(b); //10
        System.out.println(num); //11
        System.out.println(c); //11
        System.out.println(num); //12


        num = 11; //
        c=++num; //pre increment
        System.out.println(num); //12
        System.out.println(c);  //12


    }
}
