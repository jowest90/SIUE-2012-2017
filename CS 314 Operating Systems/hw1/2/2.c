#include <stdio.h>
void swap_ints(int* a, int* b){
  int temp = *a;
  *a = *b;
  *b = temp;
}
int main(){
  int i = 0, j=1;
  printf("Before: %d %d\n", i, j);
  swap_ints(&i, &j);
  printf("After: %d %d\n", i, j);
  return 0;
}