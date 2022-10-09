public class SumOfArrayElements {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {21,42,49,24,35,31,52};
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of array elements are: " + sum);
    }
}
