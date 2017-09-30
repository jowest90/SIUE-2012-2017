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

list* findNthToLast(list* head, int N){
  list* temp = head;
  int count = 0;
  int cur;
  while (temp != NULL){
    count++;
    temp = temp->next;
  }
  if (count < N)
    return NULL;
  temp = head;
  cur = count-N-1;
  while ( cur > 0){
    cur--;
    temp = temp->next;
  }
  return temp;
}

int main(){
  list* head = NULL;
  int i;
  for (i = 0; i < 10; i++)
    insert(&head, i);
  print(head);
  list* temp = findNthToLast(head, 2);
  if (temp != NULL)
    printf("%d\n", temp->value);

  return 0;
}