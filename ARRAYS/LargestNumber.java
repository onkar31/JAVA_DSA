public class LargestNumber {

    private static int getLargestNum(int numbers[]){
        int largestNum = Integer.MIN_VALUE;  // -infinity
        for(int i = 0 ; i < numbers.length ; i++){
            if(largestNum < numbers[i]){
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }

    private static int getSmallestNum(int numbers[]){
        int smallestNum = Integer.MAX_VALUE;  // +infinity
        for(int i = 0 ; i < numbers.length ; i++){
            if(smallestNum > numbers[i]){
                smallestNum = numbers[i];
            }
        }
        return smallestNum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 8, 3, 5, -1, -5};
        System.out.println("Largest value is : "+ getLargestNum(numbers));
        System.out.println("-----------------------------------------");
        System.out.println("Smallest value is : "+ getSmallestNum(numbers));
    }
}
