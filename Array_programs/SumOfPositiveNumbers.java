package Array_programs;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        int[] arr = {12,32,-4,2,-1,-12,3,-43,21};
        int sumOfPos = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                sumOfPos = sumOfPos + arr[i];
            }
        }
        System.out.println("The sum of positive numbers: " +  sumOfPos);
    }
}
