package Array_programs;

public class PrintNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {12,43,54,32,-23,-33,-1,12,-54};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
