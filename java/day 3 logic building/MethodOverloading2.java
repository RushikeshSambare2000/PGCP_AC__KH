class Student {
    String name;
    int rollNo;
    float marks;

    Student(String NAME, int ROLLNO, float MARKS) {
        name = NAME;
        rollNo = ROLLNO;
        marks = MARKS;
    }

    void display() {
        System.out.println("name of student is " + name + " roll no is : " + rollNo + " marks is " + marks);
    }

    void display(String name) {
        System.out.println("The name of student is " + name);
    }

    void display(int marks) {
        System.out.println("the marks is " + marks);
        
    }

    void display(int marks, String name) {
        System.out.println("the marks is " + marks + "the name is " + name);
    }

     void display( String name, int marks) {
        System.out.println("the name is " + name + " the marks is " + marks);
    }

}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Student s1 = new Student("rushikesh", 12, 88f);
        s1.display();
        s1.display("rushikesh");
        s1.display(78);
        s1.display(78, "rushikesh");
        s1.display( "rushikesh", 78);
    }

}
