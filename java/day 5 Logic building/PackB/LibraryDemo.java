package PackB;
import PackA.Library;

class LibraryDemo extends Library{
public static void main(String[] args){
	
Library obj = new Library();

LibraryDemo1 obj3 = new LibraryDemo1();

LibraryDemo objDemo=new LibraryDemo();

System.out.println(objDemo.name);
System.out.println(obj.id);

System.out.println(obj3.Name);


System.out.println(objDemo.subcription());
}
}