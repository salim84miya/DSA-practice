import java.util.Arrays;

public class permutation {
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        int [] nums1 ={1,2,1};
         System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(getConcatenation(nums1)));
        System.out.println(Arrays.toString(runningSum(nums1)));
        
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
                ans[i] = nums[nums[i]];
                }
                return ans;
            }

            public static int[] getConcatenation(int[] nums) {
        
                int[] ans = new int[2*(nums.length)];
                for(int i=0; i<nums.length; i++){
                    ans[i]=nums[i];
                    ans[i+(nums.length)] = nums[i]; 
                   
                }
                return ans;
            } 
            
            public static int[] runningSum(int[] nums) {
                int[] ans = new int[nums.length];
                int temp =0;
                for(int i=0; i<nums.length; i++){
                        temp += nums[i];
                        ans[i]= temp;
                }
                return ans;
            }
        
    
}
