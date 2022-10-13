package Array_programs;

import java.util.Arrays;

public class InsertElementAtSpecifiedPosition {
    public static void main(String[] args) {

        int[] arr = {12,32,54,15,33,45,84};
        int position = 3;
        int element = 99;
        int[] arr2 = {4,2,13,21,32,34};
        arr[3] = 21;
        System.out.println(arr[3]);
        int[] result = addArray(arr2, element, position);
        System.out.println(Arrays.toString(result));
    }

    public  static int[] addArray(int[] arr, int element, int position) {

        int[] temp = new int[arr.length+1];
        for(int i = 0, j = 0; i < temp.length; i++) {
            if(i == position) {
                temp[i] = element;
            } else {
                temp[i] = arr[j++];
            }
        }
        return temp;
    }

}
