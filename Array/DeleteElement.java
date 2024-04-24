import java.util.*;

public class DeleteElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        } 

        System.out.println("Array before deletion of an element : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter array element position which you want to delete from array : ");
        int pos = sc.nextInt();

        for(int i = pos ; i < n-1 ; i++){
            arr[i] = arr[i+1];
        } 

        n--;

        System.out.println("\nArray after deletion of an element : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}