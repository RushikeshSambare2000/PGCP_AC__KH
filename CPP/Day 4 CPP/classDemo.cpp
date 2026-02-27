#include <iostream>
using namespace std;

class student
{             // public
    
    int roll; // acess specifier private
    char c;
    char c1;
};

struct student1
{
    int rollno;
};

struct student2
{
    //empty class - 1 byte
    char c1; //class memory still 1 byte
    char c3; // byte 
    
};

typedef class student3{
public:
    int b=15;

}stu;

int main()
{
    student s1;
    // s1.roll; // error: 'int student::roll' is private within this context
    student1 s2;
    s2.rollno;
    cout<<sizeof(student)<<endl;
    student2 s3;
    cout<<sizeof(s3)<<endl;


    //use of typedef
    typedef int intvalue;
    intvalue a=10;
    cout<<a<<endl;
   
    stu s5;    //class name using typedef
    cout<<s5.b<<endl;


    return 0;
}               