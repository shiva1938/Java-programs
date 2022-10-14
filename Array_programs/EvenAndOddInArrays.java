package Array_programs;

import java.util.Arrays;

public class EvenAndOddInArrays {
    public static void main(String[] args) {
        int[] arr = {12,32,43,24,31,34,12,44,56,41};
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even[i] = arr[i];
            } else {
                odd[i] = arr[i];
            }
        }
        System.out.println("Even numbers are: ");
        for(int i = 0; i < arr.length; i++) {
            if(even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers are: ");
        for(int i = 0; i < arr.length; i++) {
            if(odd[i] != 0) {
                System.out.print(odd[i] + " ");
            }
        }
    }
}
