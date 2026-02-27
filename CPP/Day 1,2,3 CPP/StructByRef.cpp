#include <iostream>
using namespace std;
struct Student{
 int rollNo;
 char name[200];
 float marks;
}; // student ends here

void acceptData(struct Student &s){
    printf("enter Roll no : ");
    scanf("%d",&s.rollNo);
    printf("enter name : ");
    scanf("%s",s.name);
    printf("enter Marks : ");
    scanf("%f",&s.marks);
}
void display(struct Student &s){
    printf("Name : %s \n Roll no : %d \n Marks : %.2f \n",s.name, s.rollNo, s.marks);
}

int main(){
 struct Student s1;
 acceptData(s1);
 display(s1);
 return 0;
}
