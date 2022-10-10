package Array_programs;

public class ReturnArrayFromMethod {
    public static void main(String[] args) {
        int[] arr = {21,42,35,31,35};
        arrayMethod(arr);
        System.out.println("With return type: ");
        int[] arr2 =  arrayMethod2();
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static void arrayMethod(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] arrayMethod2() {
        int[] arr2 = {1,42,5,6,43,53};
        return arr2;
    }   
}
