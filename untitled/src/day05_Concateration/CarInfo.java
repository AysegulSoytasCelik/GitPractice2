package day05_Concateration;
/*
Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. price
3. Use concatenation to print the full info of the car in
the following format:
Year Make Model, Miles, Color, Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */
public class CarInfo {
    public static void main(String[] args) {
        int year = 2018;
        String make = "Toyota Camry";
        long miles = 50_000;
        String  colour = "Red";
        long price = 19_000;

        System.out.println(year +" " + make + ", " + miles + " miles, " + colour + " $" + price + ".");








    }
}