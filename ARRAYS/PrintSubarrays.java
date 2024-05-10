
// Number of Sub-arrays = [n(n+1)/2]

public class PrintSubarrays {
    private static void printSubarray(int nums[]){
        int ts = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : "+ts);
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        printSubarray(nums);
    }
}
