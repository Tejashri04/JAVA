import java.util.*;

public class creation_2dArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Enter elements : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        } 

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}