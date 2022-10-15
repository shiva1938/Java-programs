package Array_programs;

public class GreaterThanAverage {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {12,32,43,21,43,22,14};
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum/arr.length;
        System.out.println("The average of array is: " + average);
        System.out.println("The numbers which are greater than the average: ");
        for(int j: arr) {
            if(j > average) {
                System.out.print(j + " ");
            }
        }
    }
}
