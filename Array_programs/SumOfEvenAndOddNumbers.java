package Array_programs;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int[] arr = {12,32,43,13,44,54,67,51};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("The sum of even numbers are: " + evenSum);
        System.out.println("The odd of even numbers are: " + oddSum);
    }
}
