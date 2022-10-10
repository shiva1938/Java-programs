package Array_programs;

import java.util.Scanner;

class TakeInputFromUserPrintArrayElements {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int size = input.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements: ");
    for(int i = 0; i <arr.length; i++) {
        arr[i] = input.nextInt();
    }
    System.out.println("The number of elements are: ");
    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    input.close();
  }  
} 