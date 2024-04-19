public class LastOccurrence{
    public static int printIndex(int arr[],int key,int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        
        return printIndex(arr,key,--i);
       
    }

    public static void main(String args[]){
        int arr[] = {2,3,8,3,4,1,8,2,3,9};
        System.out.println(printIndex(arr,8,arr.length-1));
    }
}