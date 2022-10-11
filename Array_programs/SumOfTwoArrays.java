package Array_programs;


public class SumOfTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {12,42,15,18,9};
        int[] arr2 = {42,12,4,5,24};
        int[] res = new int[arr1.length];


        if(arr1.length != arr2.length) {
            System.out.println("Both arrays are not equal");
        }

        for(int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] + arr2[i];
        }

        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
