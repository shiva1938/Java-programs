package Array_programs;

public class GreaterThanGivenNumber {
    public static void main(String[] args) {
        int number = 20;
        int[] arr = {12,34,42,54,26,43,21,45,65,19,27};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 20) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
