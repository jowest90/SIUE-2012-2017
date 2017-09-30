#include <stdio.h>
void set(int* a, int val){
  *a = val;
}
int main(){
  int i = 0;
  printf("Before: %d\n", i);
  set(&i, 1);
  printf("After: %d\n", i);
  return 0;
}