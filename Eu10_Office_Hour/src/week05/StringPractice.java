package week05;

public class StringPractice {
    public static void main(String[] args) {

        System.out.println(" This is a .trim method, practice . ".trim());
        System.out.println(" This is a .trim method, practice . ".replace(" ", ""));


        String data = "Hello, World" ;
        System.out.println(data.indexOf("o"));
        System.out.println(data.lastIndexOf("o"));

        String data1= ""; //this is empty
        String data2=" "; //this is not empty
        System.out.println(data1.isEmpty()); //true
        System.out.println(data2.isEmpty()); //false
        System.out.println(data1.isBlank()); //true
        System.out.println(data2.isBlank()); //true

        String data3= "PRACTICE";
        String data4="practice";
        System.out.println(data3.equals(data4)); //false
        System.out.println(data3.equalsIgnoreCase(data4)); //true

        System.out.println("Umbrella".contains("e"));
        System.out.println("Umbrella".contains("Umb"));
        System.out.println("Umbrella".contains("umbr"));

        //Robert Down Junior ==> R.D.Junior

        String firstName="Robert";
        String middleName ="Down";
        String endName="Junior";
String name="Robert Down Junior";
System.out.println(firstName.substring(0,1) + "."+middleName.substring(0,1)+"."+endName.substring(0,6));
 System.out.println(name.substring(0, 1) + "." + name.substring(7,8)+"."+name.substring(12,18));

    }
}
