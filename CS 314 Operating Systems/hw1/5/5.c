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

void removeNth(list** head, int N){
  list* temp;
  if (N == 0 && *head != NULL){
    temp = *head;
    *head = (*head)->next;
    free(temp);
  }
  else if (N == 1 && (*head) != NULL && (*head)->next != NULL){
    temp = (*head)->next;
    (*head)->next = (*head)->next->next;
    free(temp);
  }
  else{
    list *prev = *head;
    list *cur = (*head)->next;
    int i = 1;
    while (cur != NULL){
      cur = cur->next;
      prev = prev->next;
      i++;
      if (i == N){
	temp = cur;
	prev->next = cur->next;
	free(temp);
      }
    }
    
  }
}

int main(){
  list* head = NULL;
  int i;
  for (i = 0; i < 10; i++)
    insert(&head, i);
  print(head);
  removeNth(&head, 7);
  print(head);

  return 0;
}