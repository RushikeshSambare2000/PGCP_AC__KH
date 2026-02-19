import java.util.Scanner;

class ArrayDemo {
    public static void main(String[] args) {

        // Declaration and printing 1D Array
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr1 = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Declaration and printing 2D array
        int[][] arr2 = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 2D array
        int[][] arr4 = new int[3][];
        arr4[0] = new int[5];
        arr4[1] = new int[4];
        arr4[2] = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // array initialization using the user input
        int[][] arr5 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.println("Enter the value arr5["+i+"]["+j+"] :");
                arr5[i][j]=sc.nextInt();
            }
        }
         for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j]);
            }
            System.out.println();
        }

    }
}