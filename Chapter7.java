import java.util.*;

public class Chapter7  {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);


       /* 
        Array contains refernce variable that points to objects/memory location in heap

       compile time 
        dataType[] reference variable

        initialisation at run time
        dynamic memory allocation
        new dataType[size]
       */ 
      

        int[] nums = new int[5];
        
        //using for loop for input
        for (int i=0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }

        //using for loop to iterate and print the array
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        //using enhanced for loop or for each loop to iterate & print the array
        for (int i : nums) {
            System.out.print(i+" ");
        } 

          System.out.println();

        //using Arrays.toString to iterate the array and print the array

        System.out.println(Arrays.toString(nums));
    }
} 
