#include <stdio.h>
#include <stdlib.h>
typedef struct _dll{
  int value;
  struct _dll* next;
  struct _dll* prev;
}list;

void insert(list** head, int value){
  list* temp = (list*) malloc (sizeof(list));
  temp->value = value;
  temp->next = *head;
  if (*head != NULL)
    (*head)->prev = temp;
  *head = temp;
}

void print(list* head){
  while (head != NULL){
    printf("%d ", head->value);
    head = head->next;
  }
  printf("\n");
}

void reverse(list** head){
  list* temp = *head;
  list* swap = NULL;

  while (temp != NULL){
    swap = temp->next;
    temp->next = temp->prev;
    temp->prev = swap;
    if (temp->prev == NULL){
      *head = temp;
    }
    temp = temp->prev;
  }

}


int main(){
  list* head = NULL;
  int i;
  for (i = 0; i < 10; i++){
    insert(&head, i);
  }
  print(head);

  reverse(&head);

  print(head);

  return 0;
}