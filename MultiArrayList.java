import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        /* 
         Here you dont have to specifies size of the array
         we can add as much element we want 
         the size of arraylist is fixed when half of the capacity is filled
         new arraylist of double the size of original arraylist is created and the old elements are copied in it
         */

         /* 
          Here arraylist only takes objects so we have to use wrapper class
         we may or may not need to specifies the data type of arraylist 
          */

          ArrayList<Integer> list = new ArrayList<>();

          list.add(23);
          list.add(15);
          list.add(239);
          list.add(5);

          /* 
           we dont need for loop for or toString to print list as it as already been implemented in it
           */

           System.out.println(list);

           //for getting a value at specific index we use get method in list
          
           /* for(int i=0; i<4; i++){
            System.out.println(list.get(i));
            
           } */
           

           /*
            The two dimensional arraylist is an arraylist of arraylist
            the data type itself is arraylist here
             */

             ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();


             //first we have to initiazed the list else we will get error
             for(int i=0; i<3; i++){
                list2.add(new ArrayList<>());
            }

         /*    inputting the 2D arraylist first using get method to get the inner ararylist
             and then add to insert element into that list */
             for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){    
                list2.get(i).add(in.nextInt());
             }
            }

            //printing the list
            System.out.println(list2);
        
    }
    
}
