// Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given renge of indices from 1 to r (both included).
// Note: The values of l and r in queries follow 1-based indexing.


import java.util.Scanner;

public class RangeQuery {

    static int[] makePrefixSumsArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
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

        int[] PrefixSums = makePrefixSumsArray(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = PrefixSums[r] - PrefixSums[l - 1] ;

            System.out.println("Sum " + ans);
        }
    }
}
