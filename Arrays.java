import java.util.Scanner;

public class Arrays{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Rows ");
        int row = scn.nextInt();
        System.out.println("Enter Cols ");
        int col = scn.nextInt();
        int a[][] = new int[row][col];
        
        a = InputArray(a, row, col);
        PrintArray(a);
    }
    private static int[][] InputArray(int[][] a,int row,int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        return a;
    }

    private static void PrintArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t" );
            }
            System.out.println("\n");
        }
    }
}