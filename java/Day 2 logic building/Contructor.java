import java.sql.Struct;

class Student {
    String Name;
    int RollNo;
    Float Marks;
    boolean Status;

    static String CollegeName = "Kharghar Mumbai";

    Student() {
        System.out.println("contructor call...");   
    }

    Student( String name, int rollno, float marks, boolean status){  // parameterized contructor
        Name=name;
        RollNo=rollno;
        Marks=marks;
        Status=status;

    }

    Student(String name){
        Name=name;
    }


    float Display_marks() {
        System.out.println("the marks is "+Marks);
        return Marks;
    }

};

class Teacher {
    static String batch="febb 2026";
    String subject;
    int id;

    String Display_Subject() {
        System.out.println("i am assigned to subject :" + subject);    //instance method
        return subject;
    }

    Teacher(String a, int b){
       subject=a;
       id=b;
    }
}

class Contructor {
    public static void main(String[] args) {



        Student s1 = new Student("Rushikesh Sambare ", 15, 99.99f, true);
        System.out.println(s1.Name);
        System.out.println(s1.RollNo);
        System.out.println(s1.Marks);
        System.out.println(s1.Status);

        Student s2 = new Student("Soham patil", 16, 89.9f, false);
        System.out.println(s2.Name);
        System.out.println(s2.RollNo);
        System.out.println(s2.Marks);
        System.out.println(s2.Status);
        
        Student s3 = new Student("kiran prajapati", 17, 77.9f, true);
        System.out.println(s3.Name);
        System.out.println(s3.RollNo);
        System.out.println(s3.Marks);
        System.out.println(s3.Status);
        s3.Display_marks();

        //by one para contructor.. only mohan print other set as default
        Student s4 = new Student("mohan");
        System.out.println(s4.Name);
        System.out.println(s4.RollNo);
        System.out.println(s4.Marks);
        System.out.println(s4.Status);
    


        Teacher t1=new Teacher("java", 1212);
        System.out.println(t1.subject);
        System.out.println(t1.id);

        t1.Display_Subject();

    }
}
