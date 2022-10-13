package Array_programs;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] arr = {12,32,5,13,43,23};
        int element = 3;
        for(int i = 0; i < arr.length; i++) {
            if(i == element) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
