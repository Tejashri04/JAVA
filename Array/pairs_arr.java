import java.util.*;

public class pairs_arr{
    public static void print_pairs(int arr[]){
        int total = 0;
        for(int i =0 ; i <arr.length ; i++){
            int curr = arr[i];
            for(int j = i+1 ; j < arr.length ; j++){
                System.out.print("(" + curr + "," + arr[j] + ")  ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " +total);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};

        print_pairs(arr);

    }
}  

