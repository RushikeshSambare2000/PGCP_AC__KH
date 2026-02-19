class Student {
    String Name;
    int RollNo;
    Float Marks;
    boolean Status;

    static String CollegeName = "Kharghar Mumbai";

    Student() {
        System.out.println("contructor call...");
    }

    float Display_marks() {
        return Marks;
    }

};

class Teacher {
    String subject;
    int id;

    String Display_Subject() {
        System.out.println("i am assigned to subject" + subject);
        return subject;
    }
}

class Class_Object {
    public static void main(String[] args) {

  /*      this will print default values

        Student s1 = new Student();
        System.out.println(s1.Name);
        System.out.println(s1.RollNo);
        System.out.println(s1.Marks);
        System.out.println(s1.Status);
        Student s2 = new Student();
        System.out.println(s2.Name);
        System.out.println(s2.RollNo);
        System.out.println(s2.Marks);
        System.out.println(s2.Status);
        Student s3 = new Student();
        System.out.println(s3.Name);
        System.out.println(s3.RollNo);
        System.out.println(s3.Marks);
        System.out.println(s3.Status); */


        Student s1 = new Student();
        System.out.println(s1.Name);
        System.out.println(s1.RollNo);
        System.out.println(s1.Marks);
        System.out.println(s1.Status);

        Student s2 = new Student();
        System.out.println(s2.Name);
        System.out.println(s2.RollNo);
        System.out.println(s2.Marks);
        System.out.println(s2.Status);
        
        Student s3 = new Student();
        System.out.println(s3.Name);
        System.out.println(s3.RollNo);
        System.out.println(s3.Marks);
        System.out.println(s3.Status);

    }
}
