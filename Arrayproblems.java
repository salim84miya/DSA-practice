import java.util.Arrays;

public class Arrayproblems{
    public static void main (String[] args){
        
        int [] arr = {
            1,2,4,5,9
        };

        System.out.println(Arrays.toString(arr));
        
       /*  swap (arr,1,4); */

       reverse(arr); 

       System.out.println(Arrays.toString(arr));
    }


    //swapping values in an array
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }

    //reversing an array

    public static void reverse(int[] arr){
        
        int length = arr.length;
            for(int i=0; i<length/2; i++){
                int temp = arr[i];
                arr[i]=arr[length-1-i];
                arr[length-1-i] = temp;
            }
    }
}