import java.util.Scanner;
public class ABCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int A=65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                char B=(char)A;
                System.out.print(B+" ");
                A++;
            }
            System.out.println();
            A=65;
        }

    }
}
