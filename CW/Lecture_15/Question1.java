//count the number of occurrences of a particular element x.


import java.util.*;

public class Question1 {
    

    static int countOccurrences(int[] arr, int x){
        int count = 0;
        for(int i  = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("COUNT OF X: " + countOccurrences(arr, x));
    }
}
 