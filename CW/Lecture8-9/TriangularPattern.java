import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
       
        for(int i = 1; i <= r; i++){
            // for(int j = 1; j <= i; j++){    //(sidha print karne ke liye)

            for(int j = 1; j <= (r+1-i); j++){    //(aulta print karne ke liye)
            
                System.out.print("*");
            }
            System.out.println();
        }       
    }
}
