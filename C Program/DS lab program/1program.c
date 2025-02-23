//Perform enqueue, dequeue, display operations in a queue.

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

int queue[MAX_SIZE];
int front = -1;
int rear = -1;

void enqueue(int value) {
    if (rear == MAX_SIZE - 1) {
        printf("Queue is full\n");
    } else {
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = value;
        printf("%d enqueued to queue\n", value);
    }
}

int dequeue() {
    int value;
    if (front == -1 || front > rear) {
        printf("Queue is empty\n");
        return -1;
    } else {
        value = queue[front];
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return value;
    }
}

void display() {
    if (front == -1) {
        printf("Queue is empty\n");
    } else {
        printf("Queue: ");
        for (int i = front; i <= rear; i++) {
            printf("%d ", queue[i]);
        }
        printf("\n");
    }
}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    printf("Dequeued: %d\n", dequeue());
    display();
    return 0;
}