package TaskSolutionWithFriends;

public class LocalRestaurant {
    public static void main(String[] args) {


    Restaurant restaurant1=new Restaurant("Aysegul","Oxford",5);
    Server [] server = { new Server("tugba",123,10.5,true),
            new Server("havva",124,11.5,false),
    new Server("neva",125,12.5,true)  };


    Chef chef1 = new Chef("neva",125,12.5,true);

        restaurant1.hireServer(server);
        restaurant1.hireChef(chef1);

        System.out.println(restaurant1);

    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	- Make a Restaurant object
	- Create an array of servers with their information set.
	       Add those initial servers to the ArrayList of Servers in the Restaurant object
	 - Create an array of chefs with their information set.
	       Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */