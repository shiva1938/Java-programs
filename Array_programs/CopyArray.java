package Array_programs;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] originalArray = {12,32,14,24,15};
        int[] copiedArr = originalArray;
        
        System.out.println("Original array: ");
        for(int i = 0; i < originalArray.length; i++) {
            System.out.println(originalArray[i]);
        }

        System.out.println();
        System.out.println("copied array: ");
        for(int i = 0; i < copiedArr.length; i++) {
            System.out.println(copiedArr[i]);
        }
        
        System.out.println();

        //Another way to print array
        System.out.println("Original array is: " + Arrays.toString(originalArray));
        System.out.println("Copied array is: " + Arrays.toString(copiedArr));
    }
}
