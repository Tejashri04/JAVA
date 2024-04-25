public class SecondLargest{
    public static void main(String args[]){
        int arr[] = {2,3,4,1,8,9,4,14,2};

        int largest = arr[0];
        int slargest = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        } 

        System.out.println("Second Largest element from the array is : " +slargest);
    }
}