public class AllOccurrences{
    public static void printIndex(int arr[],int key ,int i){
        if(i == arr.length){
            return ;
        }

        if(arr[i] == key){
            System.out.print(i + " ");
        }

        printIndex(arr,key,i+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,2,6,2,6};
        printIndex(arr,2,0);
    }
}