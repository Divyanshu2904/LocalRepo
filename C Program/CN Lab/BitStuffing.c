// write a c program to implement data link layer framing method bit stuffing.
// #include <stdio.h>

// void bitStuffing(int a[], int n) {
//     int b[50]; 
//     int i, j = 0, count;

//     for (i = 0; i < n; i++) {
//         b[j++] = a[i];  
//         if (a[i] == 1) { 
//             count = 1;  
            
//             // Check next bits for consecutive 1s
//             for (int k = i + 1; k < n && a[k] == 1 && count < 5; k++) {
//                 b[j++] = a[k];
//                 count++;
//                 i = k;  
//             }

//             // If 5 consecutive 1s, insert a 0
//             if (count == 5) {
//                 b[j++] = 0;
//             }
//         }
//     }

//     // Display the bit-stuffed frame
//     printf("After Bit Stuffing: ");
//     for (i = 0; i < j; i++) {
//         printf("%d", b[i]);
//     }
//     printf("\n");
// }

// int main() {
//     int n, a[20];

//     printf("Enter frame size: ");
//     scanf("%d", &n);

//     printf("Enter the frame (only 0s and 1s):\n");
//     for (int i = 0; i < n; i++) {
//         scanf("%d", &a[i]);
//     }

//     bitStuffing(a, n); 

//     return 0;
// }






#include <stdio.h>
#include <string.h>

int main() {
    int a[20], b[30]; 
    int i, j, k, count, n;

    printf("Enter frame size (Example: 8): ");
    scanf("%d", &n);

    printf("Enter the frame in the form of 0 and 1:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    i = 0;
    j = 0;
    
    while (i < n) {
        if (a[i] == 1) {
            b[j] = a[i];
            count = 1;

            for (k = i + 1; k < n && a[k] == 1 && count < 5; k++) {
                j++;
                b[j] = a[k];
                count++;
            }

            if (count == 5) { 
                j++;
                b[j] = 0;
            }

            i = k; 
        } else {
            b[j] = a[i];
            i++;
        }
        j++;
    }

    printf("After Bit Stuffing: ");
    for (i = 0; i < j; i++) {
        printf("%d", b[i]);
    }

    printf("\n");
    return 0;
}
