package Array_programs;

public class CumulativeSum {
    public static void main(String[] args) {
        int[] arr = {12,32,5,2,11,31};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }
    }
}
