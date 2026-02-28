#include<iostream>
using namespace std;

class student{
    const int rollNumber;
    string name;
    float marks;
public:
    student(int rollNumber,string name, float marks):rollNumber(rollNumber),name(name), marks(marks){
        // this->rollNumber=rn;  // we can not  initialize
        // this->name=name;
        // this->marks=marks;
    }   
    void setdata(){ //we can not change the value of roll no because of const
        // this->rollNumber=20;  //error: assignment of read-only member 'student::rollNumber'
    }

    void getdata() const{
        cout<<" name : "<<this->name<<endl<<" Roll no : "<<this->rollNumber<<endl<<" Marks :"<<this->marks;
    }

};

int main(){
    student s1(10,"ruhsi",22.3f);
    s1.getdata();
    return 0;
}