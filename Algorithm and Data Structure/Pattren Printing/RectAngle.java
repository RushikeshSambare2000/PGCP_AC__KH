import java.util.Scanner;

public class RectAngle {
   public RectAngle() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();

      for(int var4 = 1; var4 <= var2; ++var4) {
         for(int var5 = 1; var5 <= var3; ++var5) {
            System.out.print(" * ");
         }

         char var6 = 'A';
         ++var6;
         System.out.println(var6);
      }

   }
}

