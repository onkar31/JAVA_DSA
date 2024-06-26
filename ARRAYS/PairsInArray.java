
// total number of pairs in an Array = n(n-1)/2

public class PairsInArray{

    public static int printPairs(int numbers[]){
        int tp = 0;
        for(int i = 0; i < numbers.length ; i++){
           for(int j = i + 1 ; j < numbers.length ; j++){
            System.out.print("("+ numbers[i] + "," + numbers[j] + ")");
            tp++;
           }
           System.out.println();
        }
        return tp;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int totalPairs = printPairs(numbers);
        System.out.println("Total Pairs : "+ totalPairs);
    }
}