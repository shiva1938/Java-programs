package Array_programs;

public class CountOddEven {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int[] arr = {12,32,42,13,48,14,21};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The even numbers are: " + evenCount);
        System.out.println("The odd numbers are: " + oddCount);
    }
}
