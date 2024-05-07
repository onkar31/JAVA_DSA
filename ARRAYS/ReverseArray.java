// Reverse an Array without creating new Array

// Space complexity - O(n)    Time Complexity - O(n)

public class ReverseArray {
    
    public static void reverse(int numbers[]){
        int start = 0, end = numbers.length-1;

        while(start < end) {
            // swap
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] =  {2, 4, 6, 8 , 10};
        reverse(numbers);
        for(int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
