package Array_programs;

public class AverageArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {12,23,13,24,53,24,14};
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int arrLength = arr.length;
        int average = sum/arrLength;
        System.out.println("The average of array is: " + average);
    }
}
