import java.util.*;

public class InsertElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        } 

        System.out.println("Array before insertion of an element : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter array element position and element where you want to insert an element : ");
        int pos = sc.nextInt();
        int ele = sc.nextInt();


        for(int i = n ; i > pos ; i--){
            arr[i] = arr[i-1];
        } 

        arr[pos] = ele;
        n++;

        System.out.println("\nArray after insertion of an element : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}