//sum of the numbers in the second row of the array

import java.util.*;

public class sum{
    public static void rowSum(int matrix[][]){
        int sum = 0;

        for(int i = 0 ; i < matrix[0].length ; i++){
            sum += matrix[1][i];
        } 

        System.out.println(sum);
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        rowSum(matrix);
    }
}