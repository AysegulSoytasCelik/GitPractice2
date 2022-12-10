package week02;

public class WithMatt {
    public static void main(String[] args) {
     int data[]={2010, 2013, 2014, 2015, 2014} ;
     int key=2014;
     int count= 0;
     for (int e:data){
         if (e!=key){

             continue;


         }
         count++;
     }

        System.out.println(count+" found");

     int[][] array= new int [][]{{1,2},{3,4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(array[i][j]+" ");
            }

        }
     //array[1]=array[0];
      //  System.out.println(array[1][0]);

        System.out.println("---------------------------------");


        





    }
}
