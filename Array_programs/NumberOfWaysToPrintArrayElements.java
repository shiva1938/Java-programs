package Array_programs;

public class NumberOfWaysToPrintArrayElements {
    public static void main(String[] args) {
        System.out.println("First way: ");
        int[] arr = {12,32,53,25,14};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Second way: ");
        for(int arrEle: arr) {
            System.out.println(arrEle);
        }
    }    
}
