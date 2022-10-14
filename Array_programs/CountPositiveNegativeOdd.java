package Array_programs;

public class CountPositiveNegativeOdd {
    public static void main(String[] args) {
        long posCount = 0;
        long negCount = 0;
        long zeroCount = 0;
        int[] arr = {12,33,14,-12,-5,0,3,-23,0,0,34};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("The number of postive numbers are: " + posCount);
        System.out.println("The number of negative numbers are: " + negCount);
        System.out.println("The number of zero count: " + zeroCount);
    }
}
