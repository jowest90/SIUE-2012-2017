#include <stdio.h>
#include <stdlib.h>
typedef struct _bst{
  int value;
  struct _bst* left;
  struct _bst* right;
}BST;

BST* BST_initnode(int value){
  BST* ret = (BST*) malloc(sizeof(BST));
  ret->value = value;
  ret->left = NULL;
  ret->right = NULL;
  return ret;
}

void BST_insert(BST** root, int value){
  BST* temp = BST_initnode(value);
  
  if (*root == NULL){
    *root = temp;
    return;
  }

  if (value < (*root)->value)
    BST_insert(&((*root)->left), value);
  else
    BST_insert(&((*root)->right), value);
}

void inorder_print(BST* root){
  if (root != NULL){
	inorder_print(root->left);
    printf("%d ", root->value);
    inorder_print(root->right);
  }
}

int main(){
  int ints[6] = {100, 75, 50, 125, 25, 150};
  int i = 0;

  BST *bst = NULL;

  for (i = 0; i < 6; i++){
    BST_insert(&bst, ints[i]);
  }
  
  inorder_print(bst);
  printf("\n");
  return 0;
}
