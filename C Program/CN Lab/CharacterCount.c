// write a c program to implement data link layer framing method character count.

// #include <stdio.h>
// #include <string.h>-
// int main() {
//     int n, i, j;
//     char data[20][20], temp[20][20];

//     printf("Enter the number of frames: ");
//     scanf("%d", &n);
//     getchar(); 

//     for (i = 0; i < n; i++) {
//         printf("Frame %d: ", i + 1);
//         fgets(data[i], sizeof(data[i]), stdin);
//         data[i][strcspn(data[i], "\n")] = 0; 
//     }

//     for (i = 0; i < n; i++) {
//         sprintf(temp[i], "%ld%s", strlen(data[i]), data[i]);
//     }

//     printf("\nAT THE SENDER\n");
//     printf("Data as frames:\n");
//     for (i = 0; i < n; i++) {
//         printf("Frame %d: %s\n", i + 1, temp[i]);
//     }

//     printf("\nData transmitted: ");
//     for (i = 0; i < n; i++) {
//         printf("%s", temp[i]);
//     }
//     printf("\n");

//     printf("\nAT THE RECEIVER\n");
//     printf("The data received.\n");

//     printf("\nThe data after removing count char: ");
//     for (i = 0; i < n; i++) {
//         printf("%s ", data[i]);
//     }
//     printf("\n");

//     printf("\nThe data in Frame form:\n");
//     for (i = 0; i < n; i++) {
//         printf("Frame %d: %s\n", i + 1, data[i]);
//     }

//     return 0;
// }



#include <stdio.h>
#include <conio.h>
#include <string.h>

char data[20][20];

int main() {
    int i, j, n;
    char tmp[20][20], ch;

    printf("Enter the number of frames: ");
    scanf("%d", &n);
    fflush(stdin);

    for (i = 0; i < n; i++) {
        printf("Frame %d: ", i + 1);
        gets(data[i]);
    }
 
    for (i = 0; i < n; i++) {
        tmp[i][0] = 48 + strlen(data[i]);
        strcat(tmp[i], data[i]);
    }

    printf("\nAT THE SENDER\n");
    printf("Data as frames:\n");
    for (i = 0; i < n; i++) {
        printf("Frame %d: %s\n", i + 1, tmp[i]);
    }

    printf("\nData transmitted: ");
    for (i = 0; i < n; i++) {
        printf("%s", tmp[i]);
    }

    printf("\n\nAT THE RECEIVER\n");
    printf("The data received.\n");

    for (i = 0; i < n; i++) {
        for (j = 1; j < strlen(tmp[i]); j++) {
            data[i][j - 1] = tmp[i][j];
        }
        data[i][j - 1] = '\0';
    }

    printf("\nThe data after removing count char: ");
    for (i = 0; i < n; i++) {
        printf("%s ", data[i]);
    }

    printf("\n\nThe data in Frame form:\n");
    for (i = 0; i < n; i++) {
        printf("Frame %d: %s\n", i + 1, data[i]);
    }

    getch();
    return 0;
}
