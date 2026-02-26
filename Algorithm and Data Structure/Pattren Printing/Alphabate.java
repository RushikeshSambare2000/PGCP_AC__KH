import java.util.*;
public class Alphabate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=2; j<=n+1; j++){
                if(i%2==0){
                     System.out.print((char)(j+95)+" ");
                   
                }else{
                    System.out.print((char)(63+j)+" "); 
                }
                

                
            }
            System.out.println();
            
        }
    }
}
