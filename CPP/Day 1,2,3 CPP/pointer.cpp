#include<iostream>
using namespace std;
void func(int val){
	printf("inside int func!");
}

void func1(int *val){
	printf("inside pointer func");
}


int main() {
	int* pt=nullptr;
	int * ptr=NULL;
	func1(ptr);
	func(*pt);
	return 0;
}