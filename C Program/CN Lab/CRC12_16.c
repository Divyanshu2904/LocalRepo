// write a C program to implement CRC code for the polynomials CRC-12,CRC-16 and CRC CCIP.


#include <stdio.h>
#include <conio.h>

void main() {
    int f[50], g[50], r[50], t[50], i, j, k, m, n, c = 0;
    
    // clrscr();
    printf("\nEnter frame size: ");
    scanf("%d", &n);
    
    // printf("\nEnter frame: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &f[i]);
        t[i] = f[i];
    }
    
    printf("\nEnter generator size: ");
    scanf("%d", &m);
    
    // printf("\nEnter generator: ");
    for (i = 0; i < m; i++) {
        scanf("%d", &g[i]);
    }
    
    for (i = n; i < n + m - 1; i++) {
        t[i] = 0;
    }
    
    for (i = 0; i < n; i++) {
        k = i;
        if (t[i] == 1) {
            for (j = 0; j < m; j++, k++) {
                if (t[k] == g[j]) {
                    t[k] = 0;
                } else {
                    t[k] = 1;
                }
            }
        }
    }
    
    printf("\nCheck sum is: ");
    for (i = n; i < n + m - 1; i++) {
        printf("%d ", t[i]);
        f[i] = t[i];
    }
    
    printf("\nBinary Code Sequence (BCS): ");
    for (i = 0; i < n + m - 1; i++) {
        printf("%d ", f[i]);
    }
    
    printf("\nEnter received data: ");
    for (i = 0; i < n + m - 1; i++) {
        scanf("%d", &r[i]);
    }
    
    for (i = 0; i < n; i++) {
        k = i;
        if (r[i] == 1) {
            for (j = 0; j < m; j++, k++) {
                if (r[k] == g[j]) {
                    r[k] = 0;
                } else {
                    r[k] = 1;
                }
            }
        }
    }
    
    printf("\nReceived data checksum: ");
    for (i = n; i < n + m - 1; i++) {
        printf("%d", r[i]);
        if (r[i] != 0) c = 1;
    }
    
    if (c == 1)
        printf("\nError detected");
    else
        printf("\nNo error detected");
    
    getch();
}
