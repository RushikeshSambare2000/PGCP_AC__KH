import java.util.Scanner;
class Star2{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || j==n-i+1){
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                };
            }
            System.out.println();
        }
    }
}