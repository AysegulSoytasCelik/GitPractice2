package week02;

public class SwitchStatement {
    public static void main(String[] args) {

        String brand ="Samsung";
        switch (brand){
            case "Apple":
                System.out.println("buy an iphone");
                break;

            case "Samsung":
                    System.out.println("Buy a samsung");
                    break;

            default:
                System.out.println("please enter different phone brand");
        }

        System.out.println("------------------------------------------------");

        int num= 5;
        switch (num){
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
            case 3:
                System.out.println("number is 3");
            default:
                System.out.println("please enter another number");
        }





    }
}
