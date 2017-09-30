#include <stdio.h>
#include <stdlib.h>
void swap_ptrs(int** a, int** b){
  int* temp = *a;
  *a = *b;
  *b = temp;
}
int main(){
  int *c, *d;
  c = (int*)malloc(sizeof(int));
  d = (int*)malloc(sizeof(int));
  *c = 0;
  *d = 1;
  printf("Before: %d %d\n", *c, *d);
  swap_ptrs(&c, &d);
  printf("After: %d %d\n", *c, *d);
  return 0;
}