class Parent {
    void property() {
        System.out.println("cash + home + buisness");
    }

    void marry() {
        System.out.println("bhagyalakshmi");
    }
}

class Child extends Parent {
    void marry() {
        System.out.println("anuja");
    }
    void property2() {
        System.out.println("cash + home + buisness");
    }
}

public class MethodOverrinding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.marry(); // Bhagyalakshmi
        c.marry(); // anuja
        pc.marry(); // anuja
        pc.property(); // cast + home + buisness //not found in child class at the run time. 
        /*
         * compiler 1st check the parent method if this avialable then at the
         runtime check the child method is this available then execute child method if
          method not availabl in both class then compile time error we get
         */

    }
}
