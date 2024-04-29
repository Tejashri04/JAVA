import java.util.*;

public class PascalTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for Pascal's Triangle : ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            } 

            int currValue = 1;
            for(int j = 0 ; j <= i ; j++){
                System.out.print(currValue + " ");
                currValue = currValue * (i-j) / (j+1);
            } 

            System.out.println();
        }
    }
}