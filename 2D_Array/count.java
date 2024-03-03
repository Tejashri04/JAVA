import java.util.*;
//count of 14's in array
public class count{

    public static void count(int matrix[][]){
        int count = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 14){
                    count++;
                }
            }
        }
        System.out.println("14 occurs "+ count +" times in a matrix");
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,14,9},{12,14,144}};

        count(matrix);
    }
}