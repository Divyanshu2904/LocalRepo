class ArraysExample{

    // search the given element x in the array. if present then return the index else return -1.
    // Linear search
    
    void searchInArray(){
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 20;

        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        if(ans == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }
        
    }

    // calculate the maximum value out of all the elements in the array.

    // void maxOfArray(){
    //     int[] arr = {5,3, 7, 4, 8, 9, 2};
    //     int ans = 0;

    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] > ans){
    //             ans = arr[i];
    //         }
    //     }
    //     System.out.println("max " + ans);
    // }

    // calculate the sum of all the elements in the given array.
    
    // void sumOfArray(){
    //     int[] arr = {1,4,5,6,1};
    //     int sum = 0;

    //     for(int i = 0; i < arr.length; i++){
    //         sum = sum + arr[i];
    //     }

    //     System.out.println(sum);
    // }
}



public class ArrayMain {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        // obj.sumOfArray();
        // obj.maxOfArray();
        obj.searchInArray();
        
    }
}
