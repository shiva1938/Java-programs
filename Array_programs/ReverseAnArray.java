package Array_programs;


public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = {12,32,43,53,63,24};
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
