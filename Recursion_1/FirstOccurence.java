public class FirstOccurence{
    public static int printIndex(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        
        return printIndex(arr,key,i+1);
       
    }

    public static void main(String args[]){
        int arr[] = {2,3,3,4,1,8,2,3,9};
        System.out.println(printIndex(arr,3,0));
    }
}