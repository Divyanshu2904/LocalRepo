//write a program to perform Queue operation using arrays.
#include <stdio.h>
#define MAX 5

int queue[MAX];
int front = -1, rear = -1;

int isFull() {
    return rear == MAX - 1;
}

int isEmpty() {
    return front == -1 || front > rear;
}

void insert(int element) {
    if (isFull()) {
        printf("Queue is full. Overflow condition!\n");
    } else {
        if (front == -1) front = 0;  
        queue[++rear] = element;
        printf("Inserted %d into the queue.\n", element);
    }
}

void delete() {
    if (isEmpty()) {
        printf("Queue is empty. Underflow condition!\n");
    } else {
        int element = queue[front++];
        printf("Removed %d from the queue.\n", element);
        if (front > rear) {  
            front = rear = -1;
        }
    }
}

void displayQueue() {
    if (isEmpty()) {
        printf("Queue is empty.\n");
    } else {
        printf("Queue elements are: ");
        for (int i = front; i <= rear; i++) {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}

int main() {
    int choice, value;

    while (1) {
        printf("\nQueue Operations:\n");
        printf("1. Insert\n");
        printf("2. Delete\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                insert(value);
                break;

            case 2:
                delete();
                break;
            case 3:
                displayQueue();
                break;

            case 4:
                printf("Exiting...\n");
                return 0;

            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}


 