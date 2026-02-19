
class Emp_data {
    String Emp_name;
    int Emp_Id;
    double Salary;

    Emp_data(String empname, int id, double salary) {
        System.out.println("Contructor...");
        Emp_name = empname;
        Emp_Id = id;
        Salary = salary;
    }

    void display_data() {
        System.out.println("Department : " + Employee.Deparatment + "\nThe name of emp is :" + Emp_name
                + "\n The emp is is : " + Emp_Id + "\n The emp salary is : " + Salary);
    }

    {
        System.out.println("instance block...");   //called befor contructor, used for initialize instance variable.
    }
}

class Employee {

    static String Deparatment;
    static{                            //declaration of static variable and static block
        Deparatment="Testing";
    }


    public static void main(String[] args) {
        Emp_data E1 = new Emp_data("Rushikesh Sambare", 1223, 12);
        E1.display_data();
        
    }
}
