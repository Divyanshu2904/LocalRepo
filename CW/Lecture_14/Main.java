// package College wallah.Lecture_14;
class ArraysExample{

    void multiArrays(){
        int[][] arr_1 = new int [0][1];   //(ye likh sakte hai ye)
        int[][] arr = {{56, 43, 6}, {34, 7, 8}, {12, 56, 8}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]); 
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]); 
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]); 
        System.out.println(arr[2][2]);
    }

    void demoArrays(){
        int[] ages = new int[5];
        float weights[] = new float [5];
        String [] names = {"rahul","raj","aradhya","vaishali"};
        // System.out.println(ages.length);
        // System.out.println(weights.length); 
        // System.out.println(names.length);  


        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;

        // System.out.println(ages[0]);       //(without help of loop)
        // System.out.println(ages[1]); 
        // System.out.println(ages[2]);

        // System.out.println(names[0]);
        // System.out.println(names[1]); 
        // System.out.println(names[2]);

        for(int i = 0; i < 3; i++){            //(help of loop and using the for loop)
            System.out.println(ages[i]);
        }

        for(int age : ages){                       //(this is used for each loop)
            System.out.println(age);
        }

        int i = 0;                                  //(this is used while loo)
        while (i < 3) {
            System.out.println(ages[i]);
            i++;
        }
            
    }
}




public class Main {
    public static void main (String[] args){
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        // obj.multiArrays();
    }
 }
