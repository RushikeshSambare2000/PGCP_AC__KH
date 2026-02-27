#include <iostream>
using namespace std;

class Bank
{
private:
    double Balance = 0;
    int AtmPin;

public:
    string name;

    //constructor
    Bank(double balance, int AtmPin)
    {
        Balance = balance;
        AtmPin = AtmPin;
    }

    //getter
    void SetAmount(double amount)
    {
        if (amount >= 0)
        {
            Balance = Balance + amount;
        }
        else
        {
            cout << "invalid amount.. please try again" << endl;
        }
    }

    // setter

    double GetBalanc()
    {
        return Balance;
    };

};

int main(){
   Bank SBI(10000,222);
   SBI.SetAmount(1000);
   cout<<SBI.GetBalanc()<<endl;
//    SBI.Balance=1000;   // 'double Bank::Balance' is private within this context
SBI.name="Rushikesh";
cout<<SBI.name<<endl;
}