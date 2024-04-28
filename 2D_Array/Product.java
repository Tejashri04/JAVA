import java.util.*;

public class Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter the number of rows and columns for the second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix");
            return;
        }

        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of the matrices is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

    }
}
