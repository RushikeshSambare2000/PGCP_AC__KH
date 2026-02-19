
class student{

    student(){  
      //constructor
    }

    void study(){
        System.out.println("Student need to study 2 hour");
    }
    void study(int a){
        System.out.println("student need to study :"+a+" hour");
    }

}
class MethodOverloading{
   public static void main(String[] args) {
    student s1 = new student();
    s1.study();
    s1.study(12);
   }
}