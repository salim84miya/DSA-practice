import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);


        /* 
         in 2d array we have an arr referencing
         an array containg reference variable pointing to 
         array list in memory

         that is why it is mandatory to define row size and column size as those arrays
         can be of different sizes

         */

        int[][] arr = new int[3][3];

        int[][] arr2 = {
            {1,2,3},
            {4,5,},
            {6,7,8,9}
        };

       /*  iterating an 2D array
        and taking input using simple loops
        since th 2d consists of arrays inside so theirs length/columns must be specified before iterating them
        */
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }


        //printing using simple loops
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        //printing an 2D using simple loops
        for(int row=0; row<arr2.length; row++){
            for(int col=0; col<arr2[row].length; col++){
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }


        //printing using toString and loops
        for(int i=0; i<arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));;
        }

        //printing using toString and enhanced for loop
        for(int[] row:arr2){
            System.out.println(Arrays.toString(row));
        }
        //
    }

    
}
