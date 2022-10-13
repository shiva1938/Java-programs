package Array_programs;

public class RemoveDulicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {12,32,12,43,54,32,32,43,25};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = 'o';
                }
            }
            if(arr[i] != 'o') {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
