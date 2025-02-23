//WAP to print the value if it is even and divisible by 3.
import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        // if (value % 2== 0 && value % 3 ==0){
        //     System.out.println("Found ans - " + value);

        // WAP to print the value if it is divisible by 3 or 5.
        if (value % 5 == 0 || value % 3 ==0){
            System.out.println("Found ans - " + value);

        
        }
    }
    
}
