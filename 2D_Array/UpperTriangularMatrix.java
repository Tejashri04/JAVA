import java.util.*;

public class UpperTriangularMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isUpperTriangular = true;
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) {
                break;
            }
        }

        if (isUpperTriangular) {
            System.out.println("The given matrix is upper triangular.");
        } else {
            System.out.println("The given matrix is not upper triangular.");
        }

    }
}
