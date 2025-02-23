// Check if we can partiton thre array into two subarrays with equal sum. More
// formally,check that the prefix sum of a part of the array is equal to the suffix
// sum of rest of the array.

import java.util.Scanner;

public class SubArray {

    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int num : arr){
            totalSum += num;
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
            int prefixsum = 0;
            for(int i = 0; i < arr.length; i++){
                prefixsum += arr[i];
                int suffixSum = totalSum - prefixsum;
                if(suffixSum == prefixsum){
                    return true;
                }
            }

            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition possible: " + equalSumPartition(arr));
    }
}
