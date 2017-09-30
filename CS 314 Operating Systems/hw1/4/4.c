#include <stdio.h>
#include <stdlib.h>
typedef struct _ll{
  int value;
  struct _ll* next;
}list;

void insert(list** head, int value){
  list* temp = (list*) malloc (sizeof(list));
  temp->value = value;
  temp->next = *head;
  *head = temp;
}

void print(list* head){
  while (head != NULL){
    printf("%d ", head->value);
    head = head->next;
  }
  printf("\n");
}

int findNth(list* head, int N){
  int i=0;
  while (head != NULL){
    if (i == N)
      return head->value;
    i++;
    head = head->next;
  }
  exit(1);
}

int main(){
  list* head = NULL;
  int i;
  for (i = 0; i < 10; i++)
    insert(&head, i);
  print(head);
  printf("%d\n", findNth(head, 3));

  return 0;
}