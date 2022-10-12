package Array_programs;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 32,53,24, 17, 38};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The lowest number in array: " + min);
    }
}