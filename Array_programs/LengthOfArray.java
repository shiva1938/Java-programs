package Array_programs;

public class LengthOfArray {
    public static void main(String[] args) {
        int[] arr = {12,43,25,35,32,54,84};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("The length of the array is: " + count);
        System.out.println("The length of the array is: " + arr.length);
    }
}