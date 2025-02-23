// Pattern: Two Pointer
// 1.Sort an array consisting of only 0s and 1s.
import java.util.Scanner;

public class SortArray{

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 3. Given an array of integers 'a', move all the even integers at the
    //    beginning of the array followed by all the odd integers. the
    //    relative order of odd or even integers does not matter. Return 
    //    any array that satisfies the condition. 


    static void sortArrayByParity(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }

            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }


//  static void sortZeroesAndOnes(int[] arr){
//         int n = arr.length;
//         int zeroes = 0;
//         //count number of zeroes
//         for(int i = 0; i < n; i++){
//             if(arr[i] == 0){
//                 zeroes++;
//             }
//         }
    
//         //0 to zeroes-1 : 0, zeroes to n-1 : 1
//         for(int i = 0; i < n; i++){
//             if(i < zeroes){
//                 arr[i] = 0;
//             } else {
//                 arr[i] = 1;
//             }
//         }
//     }


   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt(); 
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
        // sortZeroesAndOnes(arr);
        sortArrayByParity(arr);

        System.out.println("Sorted array: ");
        printArray(arr);

    }
}

