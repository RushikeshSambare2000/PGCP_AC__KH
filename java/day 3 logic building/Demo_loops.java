public class Demo_loops {
    public static void main(String[] args) {
        /*
         * Synax :
         * for(initialization ; condition ; increament/decreament)
         */

        /*
         * for(int i=0; i<=10; i++){
         * System.out.println(i);
         * }
         */

        /*
         * for(int i=0; i<10; System.out.println(i)){
         * i++;
         * System.out.println("i increamented");
         * }
         */
         
       /*  for ( ; i <= 10; i++) {
            System.out.println(i);   //error :cannot find symbol
        } */

           /* for(int i=0; ; i++){
                System.out.println(i); // infi loop
//             } */
// String str="rushi";
//                 if(str=="rushi"){
//                     System.out.println(str);
//                 }else{
//                     System.out.println("none");
//                 }
int i=0;
while(i<5){
    int j=0;
    while(j<5){
        
        System.out.println("i is "+i+" j is :"+j);
        j++;
    }
    i++;
}

    }
}
