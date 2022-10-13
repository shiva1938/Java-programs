package Array_programs;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int element = 24;
        int[] arr = {12,32,54,57,43,31};
        int[] resArr = addelemet(arr, 1);
        System.out.println(Arrays.toString(resArr));
    }
    public static int[] addelemet(int[] arr, int element) {

        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = element;
        return temp;
    }
}
