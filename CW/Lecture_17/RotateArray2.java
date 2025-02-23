//2.Rotate the given array'a' by k steps, where k is non-negative without using extra space.
//Note: k can be greater than n as well.

import java.util.Scanner;

public class RotateArray2 {

    // Helper method to reverse the array between two indices
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Swap two elements in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Rotate the array in place by 'k' steps
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle cases where k > n
        reverse(arr, 0, n - k - 1);  // Reverse the first part
        reverse(arr, n - k, n - 1);  // Reverse the second part
        reverse(arr, 0, n - 1);      // Reverse the entire array
    }

    // Print the array
    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();  // Print a new line after the array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();  // Read array size
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read array elements
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();  // Read the number of steps to rotate

        System.out.println("Original array:");
        printArray(arr);

        // Rotate the array in place
        rotateInPlace(arr, k);

        System.out.println("Array after rotation:");
        printArray(arr);
    }
}
