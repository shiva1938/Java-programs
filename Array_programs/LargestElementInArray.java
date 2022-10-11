package Array_programs;

public class LargestElementInArray {
    public static void main(String[] args) {

        int[] arr = {12,32,42,13,54,24};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The highest element in array is: " + max);
    }
}
