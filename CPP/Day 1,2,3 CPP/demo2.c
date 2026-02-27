#include<stdio.h>

int main(){
    int val =10;

    const int  *ptr = &val;
    printf("%p \n",ptr);
    printf("%d \n",*ptr);
    // *ptr=20;             // assignment of read-only location '*ptr'; we can not changed constat ptr
    //  printf("%d \n",*ptr);

    int *const ptr1=&val;
    printf("%p \n",ptr1);
    *ptr1=20;
    printf("%d \n",*ptr1);
  return 0;
}