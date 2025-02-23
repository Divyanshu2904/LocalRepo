//1. Given 2 integers a and b.swap the 2 given values using temporary variables. 
public class SwapTwoNumber {

    //3. Reverse an array consisting of integer values.


    
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        //traverse original array in reverse direction
        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }




      
    //2. Given 2 integers a anad b. swap the 2 given values using sum and difference method

    // static void swapWithoutTemp(int a, int b){
    //     System.out.println("Original values before swap");
    //     System.out.println("a: " + a);
    //     System.out.println("b: " + b);

    //     a = a + b;
    //     b = a - b;
    //     a = a - b;

    //     System.out.println("Values after swap");
    //     System.out.println("a: " + a);
    //     System.out.println("b: " + b);
    // }

    // a = 9, b = 3
    // static void swap(int a, int b){
        // System.out.println("Original values before swap");
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);

        // int temp = a; //temp = 9

        // a = b; // a = 3
        // b = temp ; // b = 9

        // System.out.println("Values after swap");
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);

    // }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = reverseArray(arr);
        printArray(ans);
        // swap(a, b);
        // swapWithoutTemp(a, b);
        reverseArray(arr);
    }
}
