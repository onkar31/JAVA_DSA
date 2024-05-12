public class MaxSubarraySum {
   
    public static void maxSubarraySum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k < nums.length; k++) {
                    // subarray sum
                    currSum += nums[k];
                }
                // System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum : "+maxSum);
    }
   
    public static void main(String[] args) {
        int nums[] = {1, -2, 7, -1, 3};
        maxSubarraySum(nums);
    }
}
