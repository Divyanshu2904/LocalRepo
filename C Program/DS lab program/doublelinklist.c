// WAP to create a Double Linklist and 10 elements there assertion, deletion and display.

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *prev;
    struct Node *next;
};
typedef struct Node node;
node* createNode(int data) {
    node *newNode = (node*)malloc(sizeof(node));
    newNode->data = data;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

void insertAtBeginning(node **head, int data) {
    node *newNode = createNode(data);
    if (*head == NULL) {
        *head = newNode;
    } else {
        newNode->next = *head;
        (*head)->prev = newNode;
        *head = newNode;
    }
}
void deleteNode(node **head, node *delNode) {
    if (*head == delNode) {
        *head = delNode->next;
    }
    if (delNode->next != NULL) {
        delNode->next->prev = delNode->prev;
    }
    if (delNode->prev != NULL) {
        delNode->prev->next = delNode->next;
    }
    free(delNode);
}
void displayList(node *head) {
    node *temp = head;
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}
int main() {
    node *head = NULL;

    for (int i = 1; i <= 10; i++) {
        insertAtBeginning(&head, i);
    }
    
    printf("Original List: ");
    displayList(head);

    node *temp = head;
    while (temp != NULL && temp->data != 5) {
        temp = temp->next;
    }
    if (temp != NULL) {
        deleteNode(&head, temp);
        printf("List after deleting 5:");
        displayList(head);
    }
    return 0;
}