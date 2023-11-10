import java.util.Arrays;

public class permutation {
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        int[] nums1 ={1,2,1};
        int[][] nums2 = {{2,8,7},{7,1,3},{1,9,5}};
        int[] shuffle={2,5,1,3,4,7};
       /*  System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(getConcatenation(nums1)));
        System.out.println(Arrays.toString(runningSum(nums1)));
        System.out.println(maximumWealth(nums2)); */
        System.out.println(Arrays.toString(shuffle(shuffle, 3)));
        
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
        
            public static int maximumWealth(int[][] accounts) {

                int[] ans  = new int[accounts.length];
                
                    for(int i=0; i<accounts.length; i++){
                        int temp =0;
                        for(int j=0; j<accounts[i].length; j++){
                            temp += accounts[i][j];
                        }
                        ans[i] = temp;
                    }
                    int max = ans[0];
                    for(int i=0; i<accounts.length; i++){
                        if(ans[i]>max){
                            max = ans[i];
                        }
                    }
                    return max ;
                }
            
                public static int[] shuffle(int[] nums, int n) {
        
                    int[] ans = new int[nums.length];
                    int left=0;
                    int right=n;
                    for(int i=0; i<nums.length; i++){
                        if(i%2==0){
                        ans[i]=nums[left];
                        left++;
                        }else{
                            ans[i]=nums[right];
                            right++;
                        }
                    }
                    return ans;
                }
}
